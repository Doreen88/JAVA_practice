package com.idheima.array;

import java.util.Scanner;

public class ArrayDemo3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr [] = {33,5,22,44,55,33};
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 0 ; i < 6 ;i++){
            if(arr[i] == num){
                System.out.println("索引为"+i);
                flag = 1;
                break;
            }
        }
        if(flag == 0)System.out.println("该数据不存在");
    }
}
