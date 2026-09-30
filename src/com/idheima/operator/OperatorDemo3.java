package com.idheima.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int hour = sec / 3600;
        int min = sec / 60 % 60;
        sec = sec % 60;
        System.out.println(hour + " " + min + " " + sec);
    }
}
