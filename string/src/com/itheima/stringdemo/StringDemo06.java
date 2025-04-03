package com.itheima.stringdemo;

public class StringDemo06 {
    public static void main(String[] args) {
        String phoneNumber = "114514191981";

        String begin = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(9);

        System.out.println(begin);
        System.out.println(end);

        System.out.println(begin + "****" +end);
    }
}
