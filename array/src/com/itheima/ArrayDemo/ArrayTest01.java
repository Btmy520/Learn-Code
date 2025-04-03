package com.itheima.ArrayDemo;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr01 = new int[]{1,2,3,4,5,6,7,8,9,0,};
        int count = 0;
        for (int i = 0; i < arr01.length; i++) {
            if(arr01[i] % 3 == 0){
                count++;
            }
        }
        System.out.println("能够被3整除的数字有" + count + "个");
    }
}
