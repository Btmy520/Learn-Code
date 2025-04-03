package com.itheima.a03polymorphismdemo3;

public class Dog extends Animal{


    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    //行为
    //eat & lookHome

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两条前腿死死的抱着" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
