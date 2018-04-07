package com.spring.model;

import org.springframework.stereotype.Component;

@Component("woodstock")
public class Woodstock implements Performance {

	@Override
	public void perform() {
		System.out.println("WoodStock Performing~~~");
	}

}
