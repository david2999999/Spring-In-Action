package com.spring.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	@Pointcut("execution(* com.spring.model.PerformanceImpl.perform(..))")
	public void silenceCellPhone() {
		System.out.println("Silencing cell phones");
	}
	
	@Pointcut("execution(* com.spring.model.PerformanceImpl.perform(..))")
	public void takeSeats() {
		System.out.println("Taking Seats");
	}
	
	@AfterReturning("execution(* com.spring.model.PerformanceImpl.perform(..)")
	public void applause() {
		System.out.println("Clap Clap Clap");
	}
	
	@AfterThrowing("execution(* com.spring.model.PerformanceImpl.perform(..))")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}











