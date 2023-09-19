package com.marolix.annotationconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.marolix.annotationconfig.repository.Repository;

//@Component(value = "service")
//@Primary
//public class Service  {
//class implementting the interface at runtime this class obean wil be created in the container
public class ServiceImpl1 implements ServiceInterface {
	// @Autowired
	private Repository repository;

	public void setRepo(Repository repository) {
		this.repository = repository;
	}

	public void service() {

		System.out.println("this is service");

		repository.repository();
	}
}
