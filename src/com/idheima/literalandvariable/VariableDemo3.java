package com.idheima.literalandvariable;

public class VariableDemo3 {
    public static void main(String[] args){
        int a,b,c,d;
        a = 10;
        b = 20;
        c = a + b;
        d = a - b;
        System.out.println(a + "," + b + "," + c + "," + d);
        a = b = c = d = 10;
        System.out.println(a + "," + b + "," + c + "," + d);
    }
}
