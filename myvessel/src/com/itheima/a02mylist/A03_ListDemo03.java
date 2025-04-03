package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo03 {
    public static void main(String[] args) {
        /*list遍历数组的五种方法
                1.迭代器
                2.列表迭代器
                3.增强for循环
                4.Lambda表达式
                5.普通for循环

*/

        //创建集合并且添加元素
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("2");
        list.add("3");

        //1.迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //2.增强for
        for (String s : list) {
            //变量s为第三方变量
            System.out.println(s);
        }

        //3.lambda
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach((s)-> System.out.println(s));

        list.forEach(System.out::println);


        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //列表迭代器
        //在迭代器的基础上额外添加了一个方法:在遍历的过程中可以添加元素
        ListIterator<String> sit = list.listIterator();
        while (sit.hasNext()) {
            System.out.println(sit.next());
        }



    }
}
