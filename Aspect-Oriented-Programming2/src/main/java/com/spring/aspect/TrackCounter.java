package com.spring.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TrackCounter {
	
	private Map<Integer, Integer> trackCountsMap = new HashMap<Integer, Integer>();
	
	@Pointcut("execution(* com.spring.model.BlankDisc.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber) {}


	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		System.out.println("Current Play: " + currentCount);
		trackCountsMap.put(trackNumber, ++currentCount);
	}
	

	
	public int getPlayCount(int trackNumber) {
		return trackCountsMap.containsKey(trackNumber) ? trackCountsMap.get(trackNumber) : 0;
	}
}
