package com.aviralgarg.strategy;

import com.aviralgarg.strategy.behaviors.FlyBehavior;
import com.aviralgarg.strategy.behaviors.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super();
    }

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("Mallard Duck");
    }
}
