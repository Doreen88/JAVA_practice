package com.idheima.switchdemo;

import java.util.Scanner;

public class switchdemo1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }

    }
    //无case穿透现象语句：case 1,2,3,4,5 ->{System.out.println("星期一");}
    /*switch 能有运行结果 使用yield 关键字
    String name = switch (number){
        case 1,2,3,4,5 -> {
            yield "一";
        }
    };
    只有一行可以这么写: case 1,2,3,4,5 -> "一";
     */
}
