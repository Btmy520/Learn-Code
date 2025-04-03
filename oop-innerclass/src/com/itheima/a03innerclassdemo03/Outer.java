package com.itheima.a03innerclassdemo03;

public class Outer {
    private int a = 10;

    class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            //Outer.this获取外部类对象地址值
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }
}
