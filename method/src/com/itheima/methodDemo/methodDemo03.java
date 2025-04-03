package com.itheima.methodDemo;

public class methodDemo03 {
    public static void main(String[] args) {
        System.out.println("a");
        meth();
        System.out.println("d");
    }
    public static void meth(){
        System.out.println("b");
        System.out.println("c");
    }
    public static void meth2(){
        System.out.println("e");
        System.out.println("f");
    }

    public static void getSun() {
        int num1 = 20;
        int num2 = 20;
        int Sum = num1 + num2;
    }
}
