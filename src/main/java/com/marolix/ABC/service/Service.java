package com.marolix.ABC.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marolix.ABC.config.BeanConfiguration;
import com.marolix.ABC.repository.Repository;

public class Service {
	public void service() {
		ApplicationContext cont = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		System.out.println("this is service");
		Repository r = cont.getBean(Repository.class);
		r.repository();
	}
}
