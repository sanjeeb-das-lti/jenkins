package com.springtest.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class JenkinsApplicationTests {
	public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assert equals("equals");
	}

}
