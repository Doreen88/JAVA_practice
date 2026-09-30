package com.idheima.literalandvariable;
import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//找到Scanner这个打工人


        int num = sc.nextInt();//让Scanner这个打工人去获取键盘输入的int类型数据
        //System.out.println("num:" + num);
        double num2 = sc.nextDouble();//让Scanner这个打工人去获取键盘输入的double类型数据
        String str = sc.next();//让Scanner这个打工人去获取键盘输入的String类型数据
        System.out.println("num:" + num + ",num2:" + num2 + ",str:" + str);
    }
}
