package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A07_CollectionDemo07 {
    public static void main(String[] args) {
        //lambda表达式遍历

        Collection<String> col = new ArrayList<>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("D");
        //利用匿名内部类
        //代码底层原理:
        //会自己遍历集合然后传递给下面的accept方法
        //依次表示集合中的每一个数据
        /*col.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //lambda表达式
        col.forEach(System.out::println);

    }
}
