package com.gupaoze.springBootAnalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
public class SpringBootAnalysisApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootAnalysisApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringBootAnalysisApplication.class);
		Map<String, Object> properties = new LinkedHashMap<>();
		properties.put("server.port", 0);
		springApplication.setDefaultProperties(properties);
//		springApplication.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context = springApplication.run(args);
		System.out.println(context.getBean(SpringBootAnalysisApplication.class));
	}
}
