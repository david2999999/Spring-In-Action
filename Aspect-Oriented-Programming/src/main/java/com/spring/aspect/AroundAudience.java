package com.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAudience {
	
	@Pointcut("execution(* com.spring.model.Performance.perform())")
	public void perform() {}
	
	@Around("perform()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			
			System.out.println("Silencing cell phone");
			System.out.println("Taking Seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!");
			
		}catch (Throwable e) {
			System.out.println("Demanding a refund");
		}	
	}
}
