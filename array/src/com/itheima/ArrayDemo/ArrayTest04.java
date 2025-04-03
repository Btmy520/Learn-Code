package com.itheima.ArrayDemo;

import java.util.Random;

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        for (int i = 0; i < arr.length;i++) {
            Random rand = new Random();
            int Randomindex = rand.nextInt(5);
            int temp = arr[i];
            arr[i] = arr[Randomindex];
            arr[Randomindex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
