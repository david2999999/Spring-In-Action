package com.spring.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience2 {
	
	@Pointcut("execution(* com.spring.model.PerformanceImpl.perform(..))")
	public void performanceDemoPackage() {}
	
	@Before("performanceDemoPackage()")
	public void silenceCellPhone() {
		System.out.println("Silencing cell phones");
	}
	
	@Before("performanceDemoPackage()")
	public void takeSeats() {
		System.out.println("Taking Seats");
	}
	
	@AfterReturning("performanceDemoPackage()")
	public void applause() {
		System.out.println("Clap Clap Clap");
	}
	
	@AfterThrowing("performanceDemoPackage()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
