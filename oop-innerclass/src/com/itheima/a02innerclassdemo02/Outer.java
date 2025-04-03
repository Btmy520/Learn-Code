package com.itheima.a02innerclassdemo02;

public class Outer {
    String name;


    public class Inner {
        static int a = 10;
        //外部类名.内部类名 对象名 = 外部类对象.内部类对象();
    }

    public Inner getInstance() {
        return new Inner();
    }
}
