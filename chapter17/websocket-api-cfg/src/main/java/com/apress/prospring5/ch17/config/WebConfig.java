package com.apress.prospring5.ch17.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by iuliana.cosmina on 7/29/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.apress.prospring5.ch17"})
public class WebConfig implements WebMvcConfigurer {

	// <=> <mvc:default-servlet-handler/>
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	// <=> <mvc:view-controller .../>
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/static/index.html");
	}
}