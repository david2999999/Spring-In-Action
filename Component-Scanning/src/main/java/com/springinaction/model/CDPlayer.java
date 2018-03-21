package com.springinaction.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	
	private CompactDisc disc;

	@Autowired
	public CDPlayer(CompactDisc disc) {
		this.disc = disc;
	}

	@Override
	public void play() {
		disc.play();
		
	}
	
}
