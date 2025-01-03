package com.design.pattern.decorator;
public class BaconDecorator extends BurgerDecorator {
    public BaconDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String make() {
    	System.out.println("Bacon toppin make method");
        return super.make() + ", Bacon";
    }

    @Override
    public double getCost() {
    	System.out.println("Bacon toppin cost method");
        return super.getCost() + 1.50;
    }
}
