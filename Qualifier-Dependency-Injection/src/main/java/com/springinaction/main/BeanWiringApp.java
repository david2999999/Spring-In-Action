package com.springinaction.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springinaction.config.DessertConfig;
import com.springinaction.domain.PickDessert;

public class BeanWiringApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DessertConfig.class);
		
		PickDessert dessert = context.getBean("pickDessert", PickDessert.class);
		
		dessert.showDessert();
		
		context.close();
	}
}
