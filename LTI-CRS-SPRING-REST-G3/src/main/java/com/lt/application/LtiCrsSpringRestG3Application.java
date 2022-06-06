package com.lt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.lt.*"})
@EnableWebMvc //IT will enable the WEB MVC configuration inside the SPring Container.
public class LtiCrsSpringRestG3Application {

	public static void main(String[] args) {
		SpringApplication.run(LtiCrsSpringRestG3Application.class, args);
	}

}
