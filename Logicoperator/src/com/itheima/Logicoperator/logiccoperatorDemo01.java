package com.itheima.Logicoperator;

public class logiccoperatorDemo01 {
    public static void main(String[] args) {
        //1.&并且
        System.out.println(true & true);//T
        System.out.println(false & false);//F
        System.out.println(true & false);//F
        System.out.println(false & true);//F

        //2,|或者
        System.out.println(true | false);//T
        System.out.println(false | false);//F
        System.out.println(true | false);//T
        System.out.println(false | true);//T
    }
}
