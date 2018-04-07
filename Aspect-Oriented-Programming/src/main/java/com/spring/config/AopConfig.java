package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.model.Performance;
import com.spring.model.Woodstock;


@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan("com.spring")
public class AopConfig {

	@Bean(name="wood")
	public Performance woodStock() {
		return new Woodstock();
	}
}
