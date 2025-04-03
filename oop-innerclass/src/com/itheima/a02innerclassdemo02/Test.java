package com.itheima.a02innerclassdemo02;

public class Test {
    public static void main(String[] args) {



        Outer.Inner oi = new Outer().new Inner();
        Outer o = new Outer();
        Object Inner = o.getInstance();
        System.out.println(o.getInstance());

        //com.itheima.a02innerclassdemo02.Outer$Inner@776ec8df
        //用刀乐符区分
    }
}
