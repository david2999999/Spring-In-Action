package com.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.config.AopConfig;
import com.spring.model.BlankDisc;
import com.spring.model.CompactDisc;

public class AspectOrientedProgramApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		CompactDisc compactDisc = context.getBean("blankDisc", BlankDisc.class);
		
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);

		
		
		
		System.out.println("===================");
		
		context.close();
	}
}
