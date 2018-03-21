package com.springinaction.model;

import org.springframework.stereotype.Component;

@Component
public class HardDaysNightDisc implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Today are hard days night~~~");

	}

}
