package com.example.Hell;

import static org.junit.Assert.assertEquals;

import javax.swing.Spring;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HellApplicationTests {
	
	public static org.slf4j.Logger logger =  LoggerFactory.getLogger(HellApplication.class);

	@Test
	void contextLoads() {
		logger.info("Testcases executing....");
		assertEquals(true, true);
	}

}
