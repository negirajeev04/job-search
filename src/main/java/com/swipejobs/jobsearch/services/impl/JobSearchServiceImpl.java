package com.swipejobs.jobsearch.services.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.swipejobs.jobsearch.pojo.Job;
import com.swipejobs.jobsearch.pojo.Worker;
import com.swipejobs.jobsearch.services.JobSearchService;
import com.swipejobs.jobsearch.services.WorkerSearchService;

@Service
public class JobSearchServiceImpl implements JobSearchService {

	private static final Logger log = LoggerFactory.getLogger(JobSearchServiceImpl.class);
	
	@Value( "${jobs.endpoint}" )
	private String jobsEndpoint;
	
	@Value( "${max.search.result}" )
	private long maxSearchResults;
	
	@Autowired
	private WorkerSearchService workerSearchService;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Job> getJobsForWorker(Integer workerId) {
		
		Worker worker = workerSearchService.getWorkerById(workerId);
		
		if (worker == null) {
			return Collections.emptyList();
		}
		
		log.info("Searching for Skills - {}; Certificates - {}; driverLicense - {}", worker.getSkills(),
				worker.getCertificates(), worker.getHasDriversLicense());

		List<Job> jobs = getAllJobs();
		
		List<Job> matchingJobs = jobs.stream()
				.filter(hasRequiredSkills(worker))
				.filter(hasRequiredCertificates(worker))
				.filter(meetDriverLicenseRequirements(worker))
				.filter(meetLocationRequirements(worker))
				.limit(maxSearchResults)
				.collect(Collectors.toList());
		
		return matchingJobs;
	}
	
	/**
	 * Check if worker has the skills required for the job
	 * @param worker
	 * @return Predicate
	 */
	private Predicate<Job> hasRequiredSkills(Worker worker) {
		return job -> worker.getSkills().contains(job.getJobTitle());
	}

	/**
	 * Check if worker has the required certificates for the job
	 * @param worker
	 * @return Predicate
	 */
	private Predicate<Job> hasRequiredCertificates(Worker worker) {
		return job -> worker.getCertificates().containsAll(job.getRequiredCertificates());
	}
	
	/**
	 * Check if the worker meet the driver license requirements for the job
	 * @param worker
	 * @return Predicate
	 */
	private Predicate<Job> meetDriverLicenseRequirements(Worker worker) {
		return job -> job.getDriverLicenseRequired() == false || worker.getHasDriversLicense();
	}

	/**
	 * Check if the job is within the location requirements of the worker
	 * @param worker
	 * @return Predicate
	 */
	private Predicate<Job> meetLocationRequirements(Worker worker) {
		return job -> JobSearchService.distanceBetween(job.getLocation().getLatitude(), job.getLocation().getLongitude(),
				worker.getJobSearchAddress().getLatitude(),worker.getJobSearchAddress().getLongitude()) <= worker.getJobSearchAddress().getMaxJobDistance();
	}

	@Override
	public List<Job> getAllJobs() {
		
		List<Job> jobs = Arrays.asList(restTemplate.getForObject(jobsEndpoint, Job[].class));
		return jobs;
	}

}