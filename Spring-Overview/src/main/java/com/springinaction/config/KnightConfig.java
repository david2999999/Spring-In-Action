package com.springinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.model.BraveKnight;
import com.springinaction.model.Knight;
import com.springinaction.model.Quest;
import com.springinaction.model.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
