package com.example.jig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class JigApplication {

	private static Logger log = LoggerFactory.getLogger(JigApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JigApplication.class, args);
		log.info("**************** spring boot success ******************");
	}
}
