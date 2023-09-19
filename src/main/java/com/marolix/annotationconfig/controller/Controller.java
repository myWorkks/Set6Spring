package com.marolix.annotationconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.marolix.annotationconfig.service.ServiceImpl1;
import com.marolix.annotationconfig.service.ServiceInterface;

@Component(value = "controller")
public class Controller {

//	@Autowired
//	private Service service;

	// autowiring an interface
	@Autowired
//	@Qualifier(value = "serviceImpl1")
//	@Qualifier(value = "serviceImpl2")

	private ServiceInterface servicedddddd;

	public void controller() {
		System.out.println("thi is controller");

		servicedddddd.service();
	}
}
