package com.itheima.mysort;

public class A02_SelectionDemo01 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3};

        //利用选择排序算法让数组变成1 2 3 4 5

            /*for (int j = 0; j < arr.length; j++) {
                if (arr[0] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }*/

        for (int i = 0; i < arr.length - 1; i++) {
            //每一个循环用i和i后面的数据来对比
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
