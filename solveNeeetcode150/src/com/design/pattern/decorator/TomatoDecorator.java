package com.design.pattern.decorator;

public class TomatoDecorator extends BurgerDecorator {
	public TomatoDecorator(Burger burger) {
		super(burger);
	}

	@Override
	public String make() {
		System.out.println("tomato toppin make method");
		return super.make() + ", Tomato";
	}

	@Override
	public double getCost() {
		System.out.println("tomato topping cost method");
		return super.getCost() + 0.75;
	}
}