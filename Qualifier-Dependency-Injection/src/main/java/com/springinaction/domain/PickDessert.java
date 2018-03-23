package com.springinaction.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PickDessert {
	private Dessert dessert;

	public void showDessert() {
		System.out.println(dessert);
	}
	
	@Autowired
	@Qualifier("cold")
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	
}
