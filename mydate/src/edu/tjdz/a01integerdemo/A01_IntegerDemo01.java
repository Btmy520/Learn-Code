package edu.tjdz.a01integerdemo;

public class A01_IntegerDemo01 {
    public static void main(String[] args) {
        //两种方法的获取方式
        Integer i1 = Integer.valueOf("123");
        Integer i2 = Integer.valueOf("123");
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf("128");
        Integer i4 = Integer.valueOf("128");
        System.out.println(i3 == i4);

        System.out.println("===================================");

        Integer i9 = new Integer("129");
        Integer i10 = new Integer("129");
        System.out.println(i9 == i10);

        Integer i11 = new Integer("123");
        Integer i12 = new Integer("123");
        System.out.println(i11 == i12);


    }
}
