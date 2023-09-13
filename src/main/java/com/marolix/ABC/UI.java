package com.marolix.ABC;

import com.marolix.ABC.service.Service;

public class UI {

	public static void main(String[] args) {
		System.out.println("this is ui");
		invokeService();
	}

	public static void invokeService() {
		Service s = new Service();
		s.service();
	}
}
