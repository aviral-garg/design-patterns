package com.aviralgarg.strategy.behaviors;

public class QuackSlience implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can't quack!");
    }
}
