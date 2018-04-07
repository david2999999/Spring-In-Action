package com.spring.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.aspect.TrackCounter;
import com.spring.model.BlankDisc;
import com.spring.model.CompactDisc;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan("com.spring")
public class AopConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		BlankDisc cd = new BlankDisc();
		cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
		cd.setArtist("The Beatles");
		
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy in the Sky with Diamonds");
		tracks.add("Getting Better");
		tracks.add("Fixing a Hole");
		cd.setTracks(tracks);
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}








