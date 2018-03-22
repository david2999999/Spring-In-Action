package com.springinaction.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springinaction.model.CompactDisc;
import com.springinaction.model.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc disc;
	
	@Test
	public void cdShouldNotbeNull() {
		assertNotNull(disc);
	}
	
	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Heart Club Band by The Beatles", log.getLog());
	}
}













