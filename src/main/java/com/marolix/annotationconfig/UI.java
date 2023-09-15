package com.marolix.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marolix.annotationconfig.controller.Controller;

public class UI {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Controller c = context.getBean(Controller.class);
		c.controller();
	}

}
