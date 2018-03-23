package com.springinaction.domain;

import org.springframework.stereotype.Component;

import com.springinaction.annotation.Cold;
import com.springinaction.annotation.Fruity;

@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

}
