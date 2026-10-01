package com.idheima.method;

import java.util.Scanner;

public class MethodDemo1 {
    public static int getSum(int a,int b){
        return a+b;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getSum(a,b));
    }
}
