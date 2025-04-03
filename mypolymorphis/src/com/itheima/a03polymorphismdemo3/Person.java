package com.itheima.a03polymorphismdemo3;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //养狗
    public void keepPet(Dog dog, String something) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一条" + dog.getColor() + "颜色" + dog.getAge() + "岁的狗");
        dog.eat(something);

    }

    //养猫
    public void keepPet(Cat cat, String something) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一条" + cat.getColor() + "颜色" + cat.getAge() + "岁的猫");
        cat.eat(something);

    }

}
