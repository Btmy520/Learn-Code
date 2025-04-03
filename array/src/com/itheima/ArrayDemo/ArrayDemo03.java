package com.itheima.ArrayDemo;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arr01 = new int[]{1,2,3,4,5,6,7,8,9};
        //length通用变量,寻找数组中所有的索引
        //累加求和
        int sum = 0;
        for (int i = 0; i < arr01.length; i++) {
            sum = sum + arr01[i];
        }
    }
}
