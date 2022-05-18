package com.swipejobs.jobsearch.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swipejobs.jobsearch.pojo.Job;
import com.swipejobs.jobsearch.services.JobSearchService;

@RestController
public class JobSearchController {
	
	private static final Logger log = LoggerFactory.getLogger(JobSearchController.class);
	
	@Autowired
	private JobSearchService searchService;
	
	@GetMapping("/searchFor")
	public List<Job> searchForWorker(@RequestParam(value = "workerId") String workerId) {

		List<Job> matchingJobs = searchService.getJobsForWorker(Integer.parseInt(workerId));
		log.info("Found {} Jobs", matchingJobs.size());
		return matchingJobs;
	}

}
