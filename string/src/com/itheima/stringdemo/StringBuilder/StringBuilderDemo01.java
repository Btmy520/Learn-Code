package com.itheima.stringdemo.StringBuilder;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //高效拼接字符串
        StringBuilder sb = new StringBuilder("abc123");

        //添加元素
        sb.append("def");
        sb.append("1.2.3");
        sb.append("false");
        System.out.println(sb);
        //反转
        sb.reverse();


        //获取长度
        //普及
        //StringBuilder是java内已经写好的类
        //所以打印对象不会是地址值



        System.out.println(sb);
        //转换String格式
        String str = sb.toString();
        //打印字符串
        System.out.println(str);
    }
}
