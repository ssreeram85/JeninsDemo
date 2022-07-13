package com.sree.tech;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JeninsDemoApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(JeninsDemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executed ...");
		logger.info("Test case executed12 ...");
	}

}
