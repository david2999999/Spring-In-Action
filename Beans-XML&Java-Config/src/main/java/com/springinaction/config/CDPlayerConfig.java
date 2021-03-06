package com.springinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.springinaction.model.CDPlayer;
import com.springinaction.model.CompactDisc;
import com.springinaction.model.HardDaysNightDisc;
import com.springinaction.model.RevolverDisc;
import com.springinaction.model.SgtPeppersDisc;
import com.springinaction.model.WhiteAlbumDisc;

@Configuration
//@ComponentScan("com.springinaction")
//@Import(CDConfig.class)
public class CDPlayerConfig {
	
	@Bean 
	public CompactDisc randomBeatlesCD() {
		int choice = (int) Math.floor(Math.random() * 4);
		if(choice == 0) {
			return new SgtPeppersDisc();
		}else if(choice == 1) {
			return new WhiteAlbumDisc();
		}else if(choice == 2) {
			return new HardDaysNightDisc();
		}else {
			return new RevolverDisc();
		}
	}
	
	@Bean 
	public CDPlayer cdPlayer(CompactDisc disc) {
		return new CDPlayer(disc);
	}
	
	@Bean
	public CDPlayer anothercdPlayer() {
		return new CDPlayer(randomBeatlesCD());
	}
}








