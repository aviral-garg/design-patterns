package com.aviralgarg.strategy;

import com.aviralgarg.strategy.behaviors.FlyBehavior;
import com.aviralgarg.strategy.behaviors.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super();
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    void display() {
        System.out.println("Rubber Duck");
    }
}
