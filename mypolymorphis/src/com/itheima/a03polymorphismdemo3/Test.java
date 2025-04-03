package com.itheima.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Person p = new Person(30, "老王");
        Dog d = new Dog(2, "yellow");
        p.keepPet(d, "bone");

        Person p2 = new Person(24, "Btmy");
        Cat c = new Cat(4, "blue");
        p.keepPet(d, "fish");


    }
}
