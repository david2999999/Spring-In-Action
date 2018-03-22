package com.springinaction.model;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppersDisc implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Heart Club Band";
	private String artist = "The Beatles";
	
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);

	}

}
