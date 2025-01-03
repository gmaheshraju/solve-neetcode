package com.design.pattern.decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		// Start with a basic burger
		Burger burger = new BasicBurger();
		System.out.println("Ingredients: " + burger.make());
		System.out.println("Total Cost: $" + burger.getCost());

//		// Add lettuce
//		Burger lettuceBurger = new LettuceDecorator(basicBurger);
//
//		// Add cheese to the lettuce burger
//		Burger cheeseLettuceBurger = new CheeseDecorator(lettuceBurger);bacon

		// Add bacon to the cheese lettuce burger
		Burger baconBurger = new BaconDecorator(burger);
		
		System.out.println("Ingredients: " + baconBurger.make());
		System.out.println("Total Cost: $" + baconBurger.getCost());
		
		Burger addTomatoTopping = new TomatoDecorator(baconBurger);

		// Print the final burger composition and cost
		System.out.println("Ingredients: " + addTomatoTopping.make());
		System.out.println("Total Cost: $" + addTomatoTopping.getCost());
	}
}
