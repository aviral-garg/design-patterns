package com.aviralgarg.strategy;

import com.aviralgarg.strategy.behaviors.FlyBehavior;
import com.aviralgarg.strategy.behaviors.FlyWithWings;
import com.aviralgarg.strategy.behaviors.QuackBehavior;
import com.aviralgarg.strategy.behaviors.QuackNormal;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new QuackNormal());
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    void swim() {
        System.out.println("I am swimming!");
    }

    abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
