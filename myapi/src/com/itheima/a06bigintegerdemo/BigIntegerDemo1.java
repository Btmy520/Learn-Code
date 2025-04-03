package com.itheima.a06bigintegerdemo;

public class BigIntegerDemo1 {
    //获得一个随机大整数
    public static void main(String[] args) {
        //1.创建一个BigInteger对象
        java.math.BigInteger bi = new java.math.BigInteger(100, new java.util.Random());
        System.out.println(bi);
//        main1();
//        main2();
        main3();
    }

    //获得指定的一个大整数
    //细节: 字符串必须是整数, 不然会报错
    public static void main1() {
        //1.创建一个BigInteger对象
        java.math.BigInteger bi = new java.math.BigInteger("9223372036854775809");
        System.out.println(bi);
    }

    //获得制定进制的大整数
    public static void main2() {
        //1.创建一个BigInteger对象
        java.math.BigInteger bi = new java.math.BigInteger("123456789", 16);
        System.out.println(bi);
    }

    //静态方法获取大整数,内部有优化
    public static void main3() {
        //1.创建一个BigInteger对象
        java.math.BigInteger bi = java.math.BigInteger.valueOf(123456789);
        System.out.println(bi);

        System.out.println(Long.MAX_VALUE);

//        获取两个数值位16的大整数作比较
        java.math.BigInteger bi1 = java.math.BigInteger.valueOf(16);
        java.math.BigInteger bi2 = java.math.BigInteger.valueOf(16);
        System.out.println(bi1.equals(bi2));
        System.out.println(bi1 == bi2);

        System.out.println(bi1.compareTo(bi2));

    }

}
