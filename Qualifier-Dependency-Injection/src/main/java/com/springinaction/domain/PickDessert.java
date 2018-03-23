package com.springinaction.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springinaction.annotation.Cold;
import com.springinaction.annotation.Creamy;

@Component
public class PickDessert {
	private Dessert dessert;

	public void showDessert() {
		System.out.println(dessert);
	}
	
	@Autowired
	@Cold
	@Creamy
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	
}
