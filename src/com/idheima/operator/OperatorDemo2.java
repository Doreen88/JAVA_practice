package com.idheima.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num/100);
        System.out.println(num / 10 % 10);
        System.out.println(num % 10);
    }
}
