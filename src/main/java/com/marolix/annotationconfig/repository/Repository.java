package com.marolix.annotationconfig.repository;

import org.springframework.stereotype.Component;

@Component(value = "repository")
public class Repository {
	public void repository() {
		System.out.println("this is repository");
	}
}
