package com.itheima.ArrayDemo;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //数组动态初始化格式:数据类型[] 数组名 = new 数据类型[数组长度];
        //动态初始化在没有给长度指定时可以自定给出默认值
        int[] arr01 = new int[10];
        String[] arr02 = new String[10];
        arr01[0] = 1;
        arr01[1] = 2;
        arr02[0] = "sb";
        arr02[1] = "sp";
        System.out.println(arr01[0]);
        System.out.println(arr02[0]);
        //数字类型默认初始化值为:0
        //浮点数类型默认初始化值为:0.0
        //字符类型默认初始化值为:"/u0000"空格
        //布尔类型默认初始化值为:false
        //引用数据类型默认初始化值为:null
    }
}
