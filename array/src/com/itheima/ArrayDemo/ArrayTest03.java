package com.itheima.ArrayDemo;

public class ArrayTest03 {
    public static void main(String[] args) {
        //交换两个变量的值
        //设置数组
        int[] a = new int[]{1,2,3,4,5};
        for(int i = 0 , j = a.length-1; i < j; i++,j--){
            //
            //交换i和j指向的元素
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
