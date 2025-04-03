package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo04 {
    public static void main(String[] args) {
        //定义一个方法，实现字符串反转。
        //键盘录入一个字符串，调用该方法后，在控制台输出结果
        //例如，键盘录入 abc，输出结果 cba
        String result = stringUnder("zxcvb");
        //等号前面和输出有关系
        System.out.println(result);
    }

    public static String stringUnder(String str){
        String result = "";

        for (int i = str.length() - 1; i >= 0;  i--) {
            char c = str.charAt(i);
            result += c;
        }

        return result;
    }
}
