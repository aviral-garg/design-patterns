package com.aviralgarg.strategy.behaviors;

public class QuackSqueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak squeak!");
    }
}
