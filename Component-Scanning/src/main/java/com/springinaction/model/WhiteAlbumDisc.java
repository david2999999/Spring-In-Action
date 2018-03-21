package com.springinaction.model;

import org.springframework.stereotype.Component;

@Component
public class WhiteAlbumDisc implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Singing White Album ~~");

	}

}
