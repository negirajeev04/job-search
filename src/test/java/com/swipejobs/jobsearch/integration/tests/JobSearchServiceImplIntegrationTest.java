package com.swipejobs.jobsearch.integration.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swipejobs.jobsearch.TestUtils;
import com.swipejobs.jobsearch.pojo.Job;
import com.swipejobs.jobsearch.pojo.Worker;
import com.swipejobs.jobsearch.services.impl.JobSearchServiceImpl;

@ExtendWith(SpringExtension.class)
@SpringBootTest()
public class JobSearchServiceImplIntegrationTest {
	
	@Value( "${jobs.endpoint}" )
	private String jobsEndpoint;
	
	@Value( "${workers.endpoint}" )
	private String workersEndpoint;
	
	@Autowired
    private RestTemplate restTemplate;
	
	@Autowired
	private JobSearchServiceImpl jobSearchService = new JobSearchServiceImpl();
	
	private MockRestServiceServer mockServer;
    private ObjectMapper mapper = new ObjectMapper();

    @BeforeEach
    public void init() {
        mockServer = MockRestServiceServer.createServer(restTemplate);
        mockServer.reset();
    }
	
	@Test
    public void testGetJobsForWorker() throws URISyntaxException, IOException {
		
		Worker[] dummyWorkers = TestUtils.getDummyWorkers();
		mockServer.expect(ExpectedCount.once(), 
		          requestTo(new URI(workersEndpoint)))
		          .andExpect(method(HttpMethod.GET))
		          .andRespond(withStatus(HttpStatus.OK)
		          .contentType(MediaType.APPLICATION_JSON)
		          .body(mapper.writeValueAsString(dummyWorkers))
		        );
		
		Job[] dummyJobs = TestUtils.getDummyJobs();
		mockServer.expect(ExpectedCount.once(), 
		          requestTo(new URI(jobsEndpoint)))
		          .andExpect(method(HttpMethod.GET))
		          .andRespond(withStatus(HttpStatus.OK)
		          .contentType(MediaType.APPLICATION_JSON)
		          .body(mapper.writeValueAsString(dummyJobs))
		        );
		
		List<Job> jobsForWorker = jobSearchService.getJobsForWorker(7);
		mockServer.verify();
		assertTrue(jobsForWorker.equals(Arrays.asList(TestUtils.getExpectedJobResults())));
		
	}
	
	@Test
    public void testNoResultForWorker() throws URISyntaxException, IOException {
		
		Worker[] dummyWorkers = TestUtils.getDummyWorkers();
		mockServer.expect(ExpectedCount.once(), 
		          requestTo(new URI(workersEndpoint)))
		          .andExpect(method(HttpMethod.GET))
		          .andRespond(withStatus(HttpStatus.OK)
		          .contentType(MediaType.APPLICATION_JSON)
		          .body(mapper.writeValueAsString(dummyWorkers))
		        );
		
		Job[] dummyJobs = TestUtils.getDummyJobs();
		mockServer.expect(ExpectedCount.once(), 
		          requestTo(new URI(jobsEndpoint)))
		          .andExpect(method(HttpMethod.GET))
		          .andRespond(withStatus(HttpStatus.OK)
		          .contentType(MediaType.APPLICATION_JSON)
		          .body(mapper.writeValueAsString(dummyJobs))
		        );
		
		List<Job> jobsForWorker = jobSearchService.getJobsForWorker(2);
		mockServer.verify();
		assertTrue(jobsForWorker.isEmpty());
		
	}

}
