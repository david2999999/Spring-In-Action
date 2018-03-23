package com.springinaction.configuration;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springinaction.model.NotePad;

@Configuration
public class BeanConfig {

	@Bean
	@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
	public NotePad notePad() {
		return new NotePad();
	}
}
