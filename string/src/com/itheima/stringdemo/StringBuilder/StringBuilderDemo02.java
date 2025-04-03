package com.itheima.stringdemo.StringBuilder;

import java.util.Scanner;

public class StringBuilderDemo02 {
    //StringBuilder的场景
    //1,字符串高效拼接
    //2,字符串反转
    public static void main(String[] args) {
        //对称字符串判断
        //1,键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        //2,反转键盘录入的字符串
        //StringBuilder创建新StringBuilder类型
        //appand添加元素
        //reverse反转
        //toString返回字符串
        //链式编程
        String stringa= new StringBuilder().append(str).reverse().toString();
        System.out.println(stringa);
    }

}
