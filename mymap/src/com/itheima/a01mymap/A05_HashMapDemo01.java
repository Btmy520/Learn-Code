package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A05_HashMapDemo01 {
    public static void main(String[] args) {
        /*
            需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
            存储三个键值对元素，并遍历
            要求：同姓名，同年龄认为是同一个学生
            */
        //创建HashMap对象
        HashMap<Student, String> map = new HashMap<>();

        //创建学生类对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖蓝", 33);
        Student s4 = new Student("王祖蓝", 33);

        //添加元素
        map.put(s1, "西安");
        map.put(s2, "北京");
        map.put(s3, "上海");
        map.put(s4, "广州");

        //遍历
        for (Student key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("======================");
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("======================");
        for (Student key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("======================");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
