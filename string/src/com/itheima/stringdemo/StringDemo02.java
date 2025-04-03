package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo02 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='A' && c<='Z'){
            bigCount++;
            }else if(c>='a' && c<='z'){
                smallCount++;
            }else if(c>='0' && c<='9'){
                numberCount++;
            }
        }

        System.out.println("The big count is: " + bigCount);
        System.out.println("The small count is: " + smallCount);
        System.out.println("The number count is: " + numberCount);



    }
}
