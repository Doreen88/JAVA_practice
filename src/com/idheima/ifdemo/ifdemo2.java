package com.idheima.ifdemo;

import java.util.Scanner;

public class ifdemo2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int hp = 200;
        int hurt = -1;
        while (hurt < 0) {
            System.out.println("请输入当前人物受到的伤害：");
            hurt = sc.nextInt();
        }
        hp = hp - hurt;
        if (hp <= 0) {
            hp = 1;
        }
        int heal = -1;
        while (heal < 0) {
            System.out.println("请输入当前任务回复的血量");
            heal = sc.nextInt();
        }
        hp += heal;
        if (hp > 200) {
            hp = 200;
            System.out.println("当前血量为" + hp);
        } else {
            System.out.println("当前血量为" + hp);
        }
    }
}
