package com.idheima.operator;

import java.util.Scanner;

public class OperatorDemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("百位是：" + num/100);
        System.out.println("十位是：" + num / 10 % 10);
        System.out.println("个位是：" + num % 10);


    }
}
