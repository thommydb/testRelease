package com.pbank.systemlogs;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSystemLogsAplication {

	private static final Logger log = LoggerFactory.getLogger(DemoSystemLogsAplication.class);

	@PostConstruct
	public void logSomething() {
		log.error("Sample Error Message");
		log.info("Sample Info Message");
		log.debug("Sample Debug Message");
		log.trace("Sample Trace Message");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSystemLogsAplication.class, args);
	}
	

}
