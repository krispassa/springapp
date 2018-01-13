package com.maatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.maatic"})
public class MaaticTimesheetApplication {

	//for static files to fresh build
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MaaticTimesheetApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(MaaticTimesheetApplication.class, args);
	}
}
