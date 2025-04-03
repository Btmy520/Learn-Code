package com.itheima.a02mylist;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo02 {
    public static void main(String[] args) {
        /*List系列集合独有的方法:
            void add int(int index, E element);
            E remove (int index)
            E set (int index, E element)
            E get (int index)*/

        //1.创建集合
        List<String> list = new ArrayList<>();

        //2.添加元素
        list.add("1");
        list.add("2");
        list.add("3");


        //2.删除元素
        //调用方法时出现了重载现象
        //优先调用, 式餐盒形参类型一致方法
        list.remove(1);


        //3.打印集合
//        System.out.println(list);
        //remove方法不会自动装箱
        //手动装箱,手动把基本数据类型的1, 变成Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);

        System.out.println(list);
    }
}
