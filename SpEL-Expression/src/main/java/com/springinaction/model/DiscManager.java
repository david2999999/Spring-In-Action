package com.springinaction.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscManager {
	
	@Autowired
	private BlankDisc disc;

	public BlankDisc getDisc() {
		return disc;
	}

	public void setDisc(BlankDisc disc) {
		this.disc = disc;
	}

	@Override
	public String toString() {
		return "DiscManager [disc=" + disc + "]";
	}
}
