package com.swipejobs.jobsearch.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.swipejobs.jobsearch.pojo.Worker;
import com.swipejobs.jobsearch.services.WorkerSearchService;

@Service
public class WorkerSearchServiceImpl implements WorkerSearchService {

	private static final Logger log = LoggerFactory.getLogger(JobSearchServiceImpl.class);

	@Value("${workers.endpoint}")
	private String workersEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Worker getWorkerById(Integer workerId) {
		
		Worker matchingWorker = null;
		List<Worker> workers = Arrays.asList(restTemplate.getForObject(workersEndpoint, Worker[].class));
		Optional<Worker> workerOptional = workers.stream().filter(worker -> worker.getUserId().equals(workerId))
				.findFirst();
		
		matchingWorker = workerOptional.isPresent() ? workerOptional.get() : matchingWorker;
		
		if (matchingWorker == null) {
			log.info("No worker found with user id - {}", workerId);
		}
		
		return matchingWorker;
		
	}

}
