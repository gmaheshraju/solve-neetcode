package com.design.pattern.decorator;
public abstract class BurgerDecorator implements Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String make() {
        return burger.make();
    }

    @Override
    public double getCost() {
        return burger.getCost();
    }
}
