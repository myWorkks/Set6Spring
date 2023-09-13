package com.marolix.ABC.service;

import com.marolix.ABC.repository.Repository;

public class Service {
	public void service() {
		System.out.println("this is service");
		Repository r = new Repository();
		r.repository();
	}
}
