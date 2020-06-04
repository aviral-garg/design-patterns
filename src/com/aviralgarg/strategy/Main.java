package com.aviralgarg.strategy;

import com.aviralgarg.strategy.behaviors.FlyNoWay;
import com.aviralgarg.strategy.behaviors.FlyRocketPowered;
import com.aviralgarg.strategy.behaviors.QuackSlience;
import com.aviralgarg.strategy.behaviors.QuackSqueak;

public class Main {

    public static void main(String[] args) {
        runDuckSimulator();

    }

    public static void runDuckSimulator() {
        Duck d = new MallardDuck();
        d.display();
        d.fly();
        d.quack();

        System.out.println("\nAfter change 1:");
        d.setQuackBehavior(new QuackSqueak());
        d.setFlyBehavior(new FlyRocketPowered());
        d.fly();
        d.quack();

        System.out.println("\nAfter change 2:");
        d.setQuackBehavior(new QuackSlience());
        d.setFlyBehavior(new FlyNoWay());
        d.fly();
        d.quack();
    }
}
