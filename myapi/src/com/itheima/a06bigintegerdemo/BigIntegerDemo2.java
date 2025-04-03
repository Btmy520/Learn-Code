package com.itheima.a06bigintegerdemo;

public class BigIntegerDemo2 {
    /*public BigInteger add(BigInteger val)
    加法
    public BigInteger subtract(BigInteger val)
    减法
    public BigInteger multiply(BigInteger val)
    乘法
    public BigInteger divide(BigInteger val)
    除法，获取商
    public BigInteger[] divideAndRemainder(BigInteger val)
    除法，获取商和余数
    public boolean equals(Object x)
    比较是否相同
    BigInteger pow(int exponent)
    次幂
    返回较大值/较小值
    public BigInteger max/min(BigInteger val)
    public int intValue(BigInteger val)
    转为int类型整数，超出范围数据有误
    public*/
    public static void main(String[] args) {
        java.math.BigInteger bi1 = new java.math.BigInteger("123456789");
        java.math.BigInteger bi2 = new java.math.BigInteger("123456789");
        System.out.println(bi1.equals(bi2));
        System.out.println(bi1 == (bi2));
        System.out.println(bi1.compareTo(bi2));
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));
        System.out.println(bi1.divideAndRemainder(bi2)[0]);
        System.out.println(bi1.divideAndRemainder(bi2)[1]);

        System.out.println(bi1.max(bi2));
        System.out.println(bi1.min(bi2));
        System.out.println(bi1.intValue());
        System.out.println(bi1.pow(2));
        System.out.println(bi1.pow(3));
        System.out.println(bi1.pow(4));
        System.out.println(bi1.pow(5));
        System.out.println(bi1.pow(6));
        System.out.println(bi1.pow(7));
        System.out.println(bi1.pow(8));
        System.out.println(bi1.pow(9));
        System.out.println(bi1.pow(10));


        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(bi1.pow(i));


        }



    }
}
