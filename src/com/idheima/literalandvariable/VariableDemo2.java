package com.idheima.literalandvariable;

public class VariableDemo2 {
    public static void main(String[] args){
        int attack1 = 220;
        int defense1 = 85;
        double blood1 = 1012.5;
        double skill1 = 1.2;
        int attack2 = 210;
        int defense2 = 80;
        double blood2 = 1223.3;
        double skill2 = 1.3;
        double damage1 = attack1 - defense2;
        System.out.println("我攻击对方对对方造成" + damage1 +"伤害，对方还剩" + (blood2 - damage1) + "血量");


    }
}
