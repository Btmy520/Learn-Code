package com.itheima.Logicoperator;

public class LogicoperatorDemo03 {
    public static void main(String[] args) {
        //1.&&
        //效果等同于单&
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true && true);
        System.out.println("\t");
        //2.||
        //效果等同于单|
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || true);
        //运算测试
        int a=10;
        int b=10;
        boolean result = ++a<5 && ++b<5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
