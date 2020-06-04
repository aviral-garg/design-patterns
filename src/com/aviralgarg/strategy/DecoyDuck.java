package com.aviralgarg.strategy;

import com.aviralgarg.strategy.behaviors.FlyBehavior;
import com.aviralgarg.strategy.behaviors.QuackBehavior;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super();
    }

    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("Decoy Wooden Duck");
    }
}
