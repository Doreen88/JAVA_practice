package com.idheima.ifdemo;

import java.util.Scanner;

public class ifdemo3 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        if(score >= 0 && score <= 100){
            if(score >= 60)System.out.println("通过");
            else System.out.println("不通过");
        }
        else System.out.println("输入的分数有误");

    }
}
