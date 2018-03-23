package com.springinaction.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreService {

	private ShoppingCart shoppingCart;
	private ShoppingBag shoppingBag;
	
	@Autowired
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Autowired
	public void setShoppingBag(ShoppingBag shoppingBag) {
		this.shoppingBag = shoppingBag;
	}
	
	
	
}
