package a04innerclassdemo4;

public class Outer {
    int a = 10;
    static int b = 20;

    static class Inner {
        public void show1(){
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }

        public void show2(){
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }


    }
}
