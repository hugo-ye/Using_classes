package com.company;

import static ibio.Helpers.*;

public class Main {

    public static void main(String[] args) {

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

    public static void homework3(String[] args) {
        if (args.length < 2) {
            System.exit(-1);
        }
        String processed = args[0];
        String splitWord = args[1];
        boolean splitting = true;
        while (splitting) {
            int splitStart = processed.indexOf(splitWord);
            if (splitStart < 0) {
                splitting = false;
            } else {
                String before = processed.substring(0, splitStart);
                String after = processed.substring(splitStart + splitWord.length());
                if (before.length() > 0) {
                    System.out.println(before);
                    processed = after;
                }
            }
            if (processed.length() > 0) {
                System.out.println(processed);
            }
        }

    }

}
