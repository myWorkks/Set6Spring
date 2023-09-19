package com.marolix.annotationconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.marolix.annotationconfig.repository.Repository;

@Component(value = "serviceImpl2")

public class ServiceImpl2 implements ServiceInterface {
	@Autowired
	private Repository repository;

	@Override
	public void service() {
		System.out.println("this is new service impl2");
		repository.repository();
	}

}
