package a06innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
        /*回顾匿名内部类格式

    new 类名/接口名(){

        重写的方法;

    }*/
        //理解为Swim接口的实现类对象
        //接口多态
        Swim s = new Swim(){
            @Override
            public void swim() {
                System.out.println("重写后的游泳对象");
            }
        };

        //编译看左边,运行看右边
        s.swim();

        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写后的游泳方法");
            }
        }.swim();

    }
}
