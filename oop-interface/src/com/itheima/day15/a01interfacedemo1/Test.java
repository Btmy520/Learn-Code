package com.itheima.day15.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog F = new Frog("青蛙王子", 24);
        System.out.println(F.getAge() + F.getName());
        F.eat();
        F.swim();

        Rabbit R = new Rabbit("dva", 20);
        System.out.println(R.getAge() + R.getName());

        R.eat();
    }

}
