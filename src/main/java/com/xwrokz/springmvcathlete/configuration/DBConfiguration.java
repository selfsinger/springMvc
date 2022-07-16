package com.xwrokz.springmvcathlete.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {
		System.out.println("Its a DBConfigration");
	}
	
	@Bean
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
		System.out.println("LocalEntityManagerFactoryBean is created...");
		return factoryBean;
	}
	
}
