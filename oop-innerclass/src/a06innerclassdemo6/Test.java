package a06innerclassdemo6;

public class Test {
    public static void main(String[] args) {


        new Swim(){
            @Override
            public void swim(){
                System.out.println("Swim");
            }
        };

        new Animal(){
            @Override
            public void eat(){
                System.out.println("Eat");
            }
        };

        methods(
                new Animal(){
                    @Override
                    public void eat(){
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    public static void methods(Animal a){ //Animal = 子类对象多态
        a.eat();//编译看左边,运行看右边

    }
}
