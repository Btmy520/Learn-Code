package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并且调用register方法
        Student s = new Student();
        s.setName("小蔡");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("老蔡");
        t.setAge(38);

        Admin a = new Admin();
        a.setName("腐竹");
        a.setAge(24);

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
