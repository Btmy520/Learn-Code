package com.itheima.ArrayList.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
    //定义一个集合，添加一些学生对象，并进行遍历
    //学生类的属性为:姓名，年龄。
    public static void main(String[] args) {
        ArrayList<Student> List = new ArrayList<>();
        
        //添加学生对象
            Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Student s = new Student();

            System.out.println("输入学生名称");
            String name = sc.next();
            System.out.println("输入学生年龄:");
            int age = sc.nextInt();

            s.setName(name);
            s.setAge(age);

            List.add(s);
        }


        /* Student s1 = new Student("Btmy", 24);
        Student s2 = new Student("Ninezed", 38);
        Student s3 = new Student("Doveskr", 30); */

        //添加元素


        /* List.add(s1);
        List.add(s2);
        List.add(s3); */
        
        //遍历学生对象


        for (int i = 0; i < List.size(); i++) {
            //i 索引 list.get(i)元素/学生对象
            Student s = List.get(i);
            //学生名字+学生年龄
            System.out.println(List.get(i).getName() + " " + List.get(i).getAge());
        }

        

    }
}
