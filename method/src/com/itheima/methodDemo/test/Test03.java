package com.itheima.methodDemo.test;

public class Test03 {
    public static void main(String[] args) {
        //比较两个长方形面积
        //调用方法计算长方形面积,后在做比较
        int area1 = area(1,2);
        int erea2 = area(3,2);
        if(area1 > erea2){
            System.out.println("第一个大");
        }else{
            System.out.println("第二个大");
        }


    }
    public static int area(int length, int width) {
        int area = length * width;
        return area;
    }
}
