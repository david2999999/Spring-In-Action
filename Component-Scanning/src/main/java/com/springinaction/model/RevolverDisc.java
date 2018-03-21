package com.springinaction.model;

import org.springframework.stereotype.Component;

@Component
public class RevolverDisc implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Revolverr discc in the house~~~");

	}

}
