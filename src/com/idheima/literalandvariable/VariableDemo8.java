package com.idheima.literalandvariable;

import java.util.Scanner;

public class VariableDemo8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("您的BMI指数是：" + bmi);
    }
}
