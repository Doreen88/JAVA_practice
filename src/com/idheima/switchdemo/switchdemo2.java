package com.idheima.switchdemo;

import java.util.Scanner;

public class switchdemo2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        String  operator = sc.next();
        double result = switch (operator) {
            case "+" -> {
                yield a+b;
            }
            case "-" -> {
                yield a-b;
            }
            case "*" -> {
                yield a*b;
            }
            case "/" -> {
                yield a/b;
            }
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        System.out.println(result);
    }
}
