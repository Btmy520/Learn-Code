package com.itheima.methodDemo.test;

public class test01 {
    public static void main(String[] args) {
        //用方法参数计算长方形周长
        getLength(0.5,1.5);
    }
    public static void getLength(double len, double width){
         double zhouchang = (len + width) * 2;
        System.out.println(zhouchang);
    }
}
