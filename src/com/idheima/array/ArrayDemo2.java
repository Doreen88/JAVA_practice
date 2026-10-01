package com.idheima.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //动态初始化格式:数据类型 数组名[] = new 数据类型[数组长度];
        int arr [] = new int [5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5;i++)arr [i] = sc.nextInt();
        for(int i = 0; i < 5;i++)System.out.print(arr [i] + " ");
    }
}
