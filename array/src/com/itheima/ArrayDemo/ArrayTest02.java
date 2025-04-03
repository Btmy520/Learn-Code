package com.itheima.ArrayDemo;

import java.util.Random;

public class ArrayTest02 {
    public static void main(String[] args) {
        //定义数组,引入随机数
        //数组中所有随机数之和
        //数组中所有数据的平均数
        //数组中数据比平均数小的数据
        int[] a = new int[10];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            int num = rand.nextInt(100)+1;
            a[i] = num;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("数组中所有数相加: " + sum);
        int avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg = sum / 10;
        }
        System.out.println("该数组的平均数是: " + avg);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < avg) {
                count++;
            }
        }
        System.out.println("count:" + count);
    }
}
