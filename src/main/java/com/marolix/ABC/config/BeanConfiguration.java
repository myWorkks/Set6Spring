package com.marolix.ABC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.marolix.ABC.repository.Repository;
import com.marolix.ABC.service.Service;

@Configuration
public class BeanConfiguration {
	@Bean
	public Service createServiceBean() {
		return new Service();
	}

	@Bean
	public Repository createSRepoBean() {
		return new Repository();
	}

}
