package com.spring.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class Audience {
	
	@Pointcut("execution(* com.spring.model.PerformanceImpl.perform(..))")
	public void performanceDemoPackage() {}
	
	@Pointcut("execution(* com.spring.model.Woodstock.perform(..))")
	public void woodStockPerform() {}
	
	@Pointcut("execution(* com.spring.model.*.perform(..))")
	public void allClasses() {}
	
	
	
	@Before("performanceDemoPackage()")
	//@Before("woodStockPerform()")
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
