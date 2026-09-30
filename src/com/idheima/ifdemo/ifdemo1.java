package com.idheima.ifdemo;

import java.util.Scanner;

public class ifdemo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double BodyTemperature = 39.5;
        if(BodyTemperature >= 38){
            System.out.println("体温大于38度");
        }
        else{
            System.out.println("体温正常");
        }
    }
}
