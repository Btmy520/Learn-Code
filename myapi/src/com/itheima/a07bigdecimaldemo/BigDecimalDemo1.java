package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //1.创建BigDecimal对象
        //1.1创建BigDecimal对象
        BigDecimal bd1 = new BigDecimal("123.456");
        BigDecimal bd2 = new BigDecimal("123.456");
        //1.2创建BigDecimal对象
        //结果有可能不精确
        BigDecimal bd3 = new BigDecimal(123.456);
        BigDecimal bd4 = new BigDecimal(123.456);
        //2.比较两个BigDecimal对象是否相等

        System.out.println(bd1.equals(bd2));
        System.out.println(bd3.equals(bd4));

        System.out.println(bd1);
        System.out.println(bd2);
//        System.out.println(bd3);
//        System.out.println(bd4);
    }
}
