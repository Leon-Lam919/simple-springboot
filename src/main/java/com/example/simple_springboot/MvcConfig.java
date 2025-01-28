package com.example.simple_springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index_test").setViewName("index_test");
		registry.addViewController("/login").setViewName("login");
		// registry.addViewController("/").setViewName("home");
		// registry.addViewController("/home").setViewName("home");
	}

}
