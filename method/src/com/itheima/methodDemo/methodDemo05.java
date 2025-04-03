package com.itheima.methodDemo;

import java.sql.SQLOutput;

public class methodDemo05 {
    public static void main(String[] args) {
        //调用方法返回值
        //直接调用
        //getSum(3,4,5);
        //赋值调用
        //int sum = getSum(3,4,5);
        //System.out.println(sum);
        //输出调用
        //System.out.println(getSum(3,4,5));

        //计算第一季度营业额
        //int sum1 = getSum(10,20,30);
        //计算第二季度营业额
        //int sum2 = getSum(10,20,30);
        //计算第三季度营业额
        //int sum3 = getSum(10,20,30);
        //计算第四季度营业额
        //int sum4 = getSum(10,20,30);

        //int sum = sum1 + sum2 + sum3 + sum4;
        //System.out.println(sum);

        int sum =23;



    }
    public static int getSum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
}
