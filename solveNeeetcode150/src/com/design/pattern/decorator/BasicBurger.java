package com.design.pattern.decorator;
public class BasicBurger implements Burger {
    @Override
    public String make() {
    	System.out.println("base burger make method");
        return "Basic Burger Bun";
    }

    @Override
    public double getCost() {
    	System.out.println("base burger cost method");
        return 5.00; // Base price for a plain burger
    }
}
