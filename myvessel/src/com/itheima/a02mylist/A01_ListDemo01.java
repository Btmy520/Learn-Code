package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo01 {
    public static void main(String[] args) {
        /*List系列集合独有的方法:
            void add int(int index, E element);
            E remove (int index)
            E set (int index, E element)
            E get (int index)*/

        //1.创建集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("A");
        list.add("B");
        list.add("C");

        list.add(1, "wewe");

        list.remove("wewe");

        list.remove(0);

        //3.打印集合
        System.out.println(list);
    }
}
