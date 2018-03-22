package com.springinaction.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicBeanConfig {

	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean magicBean() {
		return new MagicBean();
	}

}
