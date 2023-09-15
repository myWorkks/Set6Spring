package com.marolix.ABC.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.marolix.ABC.controller.Controller;
import com.marolix.ABC.repository.Repository;
import com.marolix.ABC.service.Service;

@Configuration
public class BeanConfiguration {
	@Bean
	@Scope(value = "singleton")
	// @Scope(value="prototype",true)
	public Service createServiceBean() {
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Repository r = new Repository();
		return new Service();
	}

	@Bean
	public Repository createSRepoBean() {
		return new Repository();
	}

	@Bean(name = "controller")
	public Controller controllerBean() {
		return new Controller();
	}

}
