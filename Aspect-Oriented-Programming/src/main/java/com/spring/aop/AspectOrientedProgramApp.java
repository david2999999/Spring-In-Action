package com.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.config.AopConfig;
import com.spring.model.Performance;
import com.spring.model.Woodstock;

public class AspectOrientedProgramApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		Performance performance = context.getBean("performanceImpl", Performance.class);
		Performance woodStock = context.getBean("wood", Woodstock.class);
		
		performance.perform();
		System.out.println("===================");
		//woodStock.perform();
		
		context.close();
	}
}
