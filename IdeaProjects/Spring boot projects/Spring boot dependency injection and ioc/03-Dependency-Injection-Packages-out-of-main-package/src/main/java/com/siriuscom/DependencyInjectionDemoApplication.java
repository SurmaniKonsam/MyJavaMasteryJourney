package com.siriuscom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.siriuscom.DependencyInjectionDemo.Controller",
				"com.siriuscom.DependencyInjectionDemo.Services"
		}
)
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionDemoApplication.class, args);
	}

}
