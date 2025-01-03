package com.design.pattern.decorator;
public class LettuceDecorator extends BurgerDecorator {
    public LettuceDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String make() {
        return super.make() + ", Lettuce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}

