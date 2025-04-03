package com.itheima.mysort;

import java.util.Random;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
        /*
        快速排序
                第一轮,以0索引的数字为基准数,确定基准数在数组中的位置
                比基准数小的全部在左边,比基准数大的全部在右边
                */

//        int[] arr = {6, 1, 7, 2, 8, 5, 3, 9, 4, 10};

        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //赋值随机数
            arr[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr, 0 , arr.length-1);
        long end = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println(end - start);

    }

    public static void quickSort(int[] arr, int i, int j){
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;

        if(start > end){
            return;
        }

        int baseNumber = arr[i];

        while (start != end){
            //利用end,从后往前开始找,找比基准数大的数字
            while (true){
                if (end <= start || arr[end] < baseNumber){
                    break;
                }
                end--;
            }
            //利用start,从前往后开始找,找比基准数小的数字
            while (true){
                if (end <= start || arr[start] > baseNumber){
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        //确定6左边的范围,重复刚才的动作
        quickSort(arr, i, start-1);
        quickSort(arr, start + 1,j);
    }
}
