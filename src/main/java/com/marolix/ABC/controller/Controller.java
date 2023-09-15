package com.marolix.ABC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marolix.ABC.config.BeanConfiguration;
import com.marolix.ABC.service.Service;

public class Controller {

	@Autowired
	private Service service;

	public void controller() {
		System.out.println("thi is controller");
//		ApplicationContext cont = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		Service s = cont.getBean(Service.class);
		service.service();
	}
}
