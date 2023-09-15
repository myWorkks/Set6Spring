package com.marolix.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.marolix.annotationconfig","com.marolix.annotation.service"})
public class ConfigClass {

}
