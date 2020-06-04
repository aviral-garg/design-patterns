package com.aviralgarg;

import java.util.Scanner;

import static com.aviralgarg.strategy.Main.runDuckSimulator;

public class Main {
    public static void main(String[] args) {

        try {
            demoLoop();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.err.println("Something went horribly wrong!");
        }
    }

    private static void demoLoop() {
        while (true) {
            showOptions();

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> showDesignPrinciples();
                case 2 -> runDuckSimulator();
                default -> System.err.println("Please select a valid option.");
            }

            showHorizontalLine();
        }
    }

    private static void showHorizontalLine() {
        System.out.println("------------------------------------------------------------------------------------");
    }

    private static void showOptions() {
        System.out.println("\nPick one of the following options:" +
                "\n\t1. Show design principles" +
                "\n\t2. Strategy pattern - Run the Duck Simulator" +
                "\n\t0. Exit");
    }

    private static void showDesignPrinciples() {
        System.out.println("Design Principles:" +
                "\n1. Identify the aspects of your application that vary and separate them from what stays the same." +
                "\n2. Program to an interface, not an implementation." +
                "\n3. Favor composition over inheritance." +
                "\n\n");
    }
}
