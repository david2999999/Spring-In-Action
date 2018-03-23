package com.springinaction.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.springinaction.model.BlankDisc;

@Configuration
@PropertySource("classpath:app.properties")
public class EnvironmentConfig {


	@Autowired
	Environment environment;
	
	// variable to hold the connection count
	// giving it a default value of 30 if it is not specified inside the app.properties
	// Integer.class is required to convert the string into an integer
	//int connectionCount = environment.getProperty("db.connection.count", Integer.class, 30);
	
	// checks if the app.properties contains the property disc.title
	//boolean titleExists = environment.containsProperty("disc.title");
	
	// declaring a bean that takes values from app.properties
	@Bean
	public BlankDisc disc() {
		return new BlankDisc(
				environment.getProperty("disc.title"),
				environment.getProperty("disc.artist"));
	}
	
	// declaring a bean that takes values from app.properties
	// if the specifed values are not declared inside app.properties
	// give them a default value
	@Bean
	public BlankDisc newDisc() {
		return new BlankDisc(
				environment.getProperty("disc.newTitle", "Rattle and Hum"),
				environment.getProperty("disc.newArtist", "U2"));
	}
	
	// declaring a bean that takes values from app.properties
	// if the specifed values are not declared inside app.properties
	// IllegalStateException will be thrown
	@Bean
	public BlankDisc requiredDisc() {
		return new BlankDisc(
				environment.getRequiredProperty("disc.title"),
				environment.getRequiredProperty("disc.artist"));
				
	}
	
	// In order to use placeholder values, you must configure either a PropertyPlaceholder-
	// Configurer bean or a PropertySourcesPlaceholderConfigurer bean.
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
