package com.itheima.methodDemo.test;

public class methodDemo06 {
    public static void main(String[] args) {
        //比较两整数是否相同
        //要求兼容所有整数类型


        //调用方法
        //compare(10,20);
        //默认为int,强转为byte类型
        //compare((byte)1, (byte)2);

        /*byte b1 = 20;
        byte b2 = 20;
        compare(b1,b2);*/

    }

    public static void compare(byte b1, byte b2) {
        System.out.println("byte");
        System.out.println(b1 == b2);
    }

    public static void compare(short c1, short c2) {
        System.out.println("short");
        System.out.println(c1 == c2);
    }

    public static void compare(int i1, int i2) {
        System.out.println("int");
        System.out.println(i1 == i2);
    }

    public static void compare(long n1, long n2) {
        System.out.println("long");
        System.out.println(n1 == n2);
    }
}
