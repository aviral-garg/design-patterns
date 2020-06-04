package com.aviralgarg.strategy;

import com.aviralgarg.strategy.behaviors.FlyBehavior;
import com.aviralgarg.strategy.behaviors.QuackBehavior;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super();
    }

    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("Redhead Duck");
    }
}
