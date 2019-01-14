package com.pbank.systemlogs;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSystemLogsAplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoSystemLogsAplication.class);

	@PostConstruct
	public void logSomething() {
		logger.debug("Sample Debug Message");
		logger.trace("Sample Trace Message");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSystemLogsAplication.class, args);
	}
	

}
