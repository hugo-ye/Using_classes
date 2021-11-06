package com.company;

import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {
        homework1();
    }

    public static void homework1() {
        for (int k = 0; k < 11; k++) {
            double a = k * Math.PI / 5;
            System.out.printf("%f, %f, %f\n", a, Math.sin(a), Math.cos(a));
        }
    }

    public static void homework2() {
        boolean running = true;
        while (running) {
            String operation = input("give operation: ");
            if (operation.equals("end")) {
                running = false;
            } else {
                int a = inputInt("give first integer operand: ");
                int b = inputInt("give second integer operand: ");
                if (operation.equals("add")) {
                    output(a + b);
                } else if (operation.equals("sub")) {
                    output(a - b);
                } else {
                    output("unknown operation");
                }
            }
        }
    }

}
