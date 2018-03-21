package com.springinaction.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.model.Knight;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        
        Knight braveKnight = context.getBean("knight" ,Knight.class);
        
        braveKnight.embarkOnQuest();
        
        context.close();
    }
}
