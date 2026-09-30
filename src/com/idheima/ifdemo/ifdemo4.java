package com.idheima.ifdemo;

import java.util.Scanner;

public class ifdemo4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextInt();
        double baolemeprice = price * 0.9;
        double meidanprice = price - ((int)price/30)*10;
        System.out.println("饱了么APP价格为"+baolemeprice);
        System.out.println("美单APP价格为"+meidanprice);
        if(meidanprice > baolemeprice)System.out.println("饱了么APP更划算");
        else if(meidanprice == baolemeprice )System.out.println("两个相同");
        else System.out.println("美单APP更划算");
    }
}
