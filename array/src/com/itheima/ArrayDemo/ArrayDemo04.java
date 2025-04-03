package com.itheima.ArrayDemo;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //数字为奇数时扩大两倍
        //数字为偶数是缩小到原来的二分之一
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        //创建数组
        for (int i = 0; i < arr.length; i++) {
            //判断奇数偶数
            if(arr[i] % 2 == 0){
                arr[i]= arr[i] / 2;
            }else{
                arr[i]= arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }
}
