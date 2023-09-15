package com.marolix.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.marolix.annotationconfig.repository.Repository;

@Component(value = "service")
public class Service {

	private Repository repository;

	@Autowired
	public void setRepo(Repository repository) {
		this.repository = repository;
	}

	public void service() {

		System.out.println("this is service");

		repository.repository();
	}
}
