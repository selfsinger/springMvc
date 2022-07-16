package com.xwrokz.springmvcathlete.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("com.xwrokz.springmvcathlete")
public class BeanConfiguration implements WebMvcConfigurer {

	public BeanConfiguration() {
		System.out.println("Creating BeanConfiguration");
	}
//
	@Bean
	public ViewResolver internalResourceViewResolver() {
		System.out.println("running ViewResolver method");
		return new InternalResourceViewResolver("/", ".jsp");

	}
    
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		configurer.enable();

	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("running addViewControllers method");
		registry.addRedirectViewController("/", "Athlete.jsp");
	}

	

}
