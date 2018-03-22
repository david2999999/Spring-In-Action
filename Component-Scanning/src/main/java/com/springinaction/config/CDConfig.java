package com.springinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.model.CompactDisc;
import com.springinaction.model.SgtPeppersDisc;

@Configuration
public class CDConfig {

	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppersDisc();
	}

}
