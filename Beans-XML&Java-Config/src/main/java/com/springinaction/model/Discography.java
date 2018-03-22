package com.springinaction.model;

import java.util.List;

public class Discography {

	private String track;
	private List<CompactDisc> discs;
	
	public Discography(String track, List<CompactDisc> discs) {
		this.track = track;
		this.discs = discs;
	}
}
