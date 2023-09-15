package com.marolix.annotationconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.marolix.annotation.service.Service;

@Component(value = "controller")
public class Controller {

	@Autowired
	private Service service;

	public void controller() {
		System.out.println("thi is controller");

		service.service();
	}
}
