package com.aviralgarg.strategy.behaviors;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Super Fly!");
    }
}
