package com.marolix.ABC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marolix.ABC.config.BeanConfiguration;
import com.marolix.ABC.controller.Controller;
import com.marolix.ABC.service.Service;

public class UI {

	public static void main(String[] args) {
		
//		Service o = context.getBean(Service.class);
//		Service o2 = context.getBean(Service.class);
//		Service s = new Service();
//		Service s2 = new Service();
//		System.out.println(s == s2);
//		System.out.println(o == o2);
		// o.service();
//		System.out.println(o.hashCode());
//		System.out.println(o2.hashCode());
		// invokeService();
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Controller c = context.getBean("controller", Controller.class);
		c.controller();

	}

}
