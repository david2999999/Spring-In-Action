package com.springinaction.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.config.CDPlayerConfig;
import com.springinaction.model.CDPlayer;
import com.springinaction.model.CompactDisc;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        
        CompactDisc disc = context.getBean("randomBeatlesCD", CompactDisc.class);
        
        CDPlayer player = context.getBean("cdPlayer", CDPlayer.class);
        CDPlayer player2 = context.getBean("anothercdPlayer", CDPlayer.class);
        
        player.play();
        player2.play();
        disc.play();
        
        context.close();
    }
}
