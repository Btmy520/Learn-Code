package com.itheima.mysort;

public class A01_BubbleDemo01 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {2, 4, 5, 3, 1};
        //外循环负责算法多次循环
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环负责判断数值大小
            //并且按大小排序
            //-1防止代码报错
            //-i提高效率,每一次执行次数要比上一轮少少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        printAll(arr);
    }

    public static void printAll(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
