package com.itheima.a01innerclassdemo01;

public class Car {
    String carName;
    String carColor;
    int carAge;


    public void show(Car this){
        //打印调用者车的名字
        System.out.println(carName);
        //外部类不能直接调用内部类，必须做对象
        Engine e =new Engine();

        System.out.println(e.engineAge);

    }

    class Engine{
        String engineName;
        String engineAge;
        public void show(){
            System.out.println(engineAge);
            System.out.println(carAge);
        }
    }
}
