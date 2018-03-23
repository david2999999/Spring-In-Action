package com.springinaction.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springinaction.domain.Dessert;
import com.springinaction.domain.IceCream;

@Configuration
@ComponentScan("com.springinaction")
public class DessertConfig {
	
	@Bean
	@Qualifier("cold")
	public Dessert iceCream() {
		return new IceCream();
	}
}
