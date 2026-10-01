package com.idheima.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo4 {
    static void main() {
        int arr [] = new int [10];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            int num = r.nextInt(101);
            boolean flag = false;
            for(int j = 0;j < i; j++){
                if(arr [j] == num)flag = true;
            }
            if(!flag)arr [i] = num;
            else {
                i--;
                continue;
            }
        }
        for(int i = 0;i < 10;i++)System.out.print(arr[i]+"\t");
    }
}
