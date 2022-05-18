package com.swipejobs.jobsearch;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swipejobs.jobsearch.pojo.Job;
import com.swipejobs.jobsearch.pojo.Worker;

public class TestUtils {
	
	private static ObjectMapper mapper = new ObjectMapper();

	public static Job[] getDummyJobs() throws StreamReadException, DatabindException, IOException {

		Job[] jobs = null;
		String basePath = "src/test/resources";

		jobs = mapper.readValue(new File(basePath + File.separator + "jobs.json"), Job[].class);

		return jobs;
	}

	public static Worker[] getDummyWorkers() throws StreamReadException, DatabindException, IOException {

		Worker[] workers = null;
		String basePath = "src/test/resources";
		
		workers = mapper.readValue(new File(basePath + File.separator + "workers.json"), Worker[].class);

		return workers;

	}

	public static Job[] getExpectedJobResults() throws StreamReadException, DatabindException, IOException {

		Job[] jobs = null;
		String basePath = "src/test/resources";
		
		jobs = mapper.readValue(new File(basePath + File.separator + "expected_job_result.json"), Job[].class);

		return jobs;
	}
}
