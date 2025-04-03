package com.itheima.ArrayDemo;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr01 = new int[]{33,5,22,44,55};
        //max值必须为数组中的值
        int max = arr01[0];
        //为提高效率,将i从1开始循环,不需要与自身再次比较,提高运行效率
        for (int i = 1; i < arr01.length; i++) {
            if (arr01[i] > max ) {
                max = arr01[i];
            }
        }
        System.out.println(max);
    }
}
