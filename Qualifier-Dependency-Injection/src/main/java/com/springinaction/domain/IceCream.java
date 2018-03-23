package com.springinaction.domain;

import org.springframework.stereotype.Component;

import com.springinaction.annotation.Cold;
import com.springinaction.annotation.Creamy;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {

	@Override
	public String toString() {
		return "IceCream []";
	}

	
	
}
