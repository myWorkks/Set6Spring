package com.marolix.ABC.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marolix.ABC.config.BeanConfiguration;
import com.marolix.ABC.service.Service;

public class Controller {
	public void controller() {
		System.out.println("thi is controller");
		ApplicationContext cont = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Service s = cont.getBean(Service.class);
		s.service();
	}
}
