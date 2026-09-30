package com.idheima.controlloop;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    static void main() {
        Random r = new Random();
        int num = r.nextInt(101);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int guess = -1;
        int cnt = 0;
        while (guess != num){
            if(cnt == 3)System.out.println("数字的范围为"+(num-5)+"~"+(num+5));
            if(cnt == 10){
                System.out.println("猜中了");
                break;
            }
            guess = sc.nextInt();
            if(guess > num){
                System.out.println("猜大了");
                cnt++;
                continue;
            }
            else if (guess < num){
                System.out.println("猜小了");
                cnt++;
                continue;
            }
            else{
                System.out.println("猜对了!数字是"+num);
                break;
            }
        }
    }
}
