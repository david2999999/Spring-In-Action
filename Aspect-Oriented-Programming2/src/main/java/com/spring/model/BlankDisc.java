package com.spring.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;
	
	
	public BlankDisc() {
	}

	public BlankDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}



	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}



	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		
		for(String track: tracks) {
			System.out.println("-Track: " + track);
		}
	}

	@Override
	public String toString() {
		return "BlankDisc [title=" + title + ", artist=" + artist + ", tracks=" + tracks + "]";
	}

	@Override
	public void playTrack(int num) {
		System.out.println("BlankDisc: PLAYING TRACK~~~~~~~~~");
		
	}
	
	

}
