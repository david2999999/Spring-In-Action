package com.springinaction.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.springinaction.model.BlankDisc;
import com.springinaction.model.CompactDisc;
import com.springinaction.model.DiscManager;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = "com.springinaction")
public class EnvironmentConfig {


	@Autowired
	Environment environment;
	
	@Bean
	public DiscManager discManager() {
		return new DiscManager();
	}
	
	// In order to use placeholder values, you must configure either a PropertyPlaceholder-
	// Configurer bean or a PropertySourcesPlaceholderConfigurer bean.
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
}
