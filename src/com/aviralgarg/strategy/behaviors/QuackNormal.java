package com.aviralgarg.strategy.behaviors;

public class QuackNormal implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
