package com.springinaction.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

	public void setDisc(CompactDisc disc) {
		this.disc = disc;
	}
	
	
	
}
