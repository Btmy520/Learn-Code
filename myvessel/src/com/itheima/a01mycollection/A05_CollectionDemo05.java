package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A05_CollectionDemo05 {
    public static void main(String[] args) {

        /*迭代器细节注意点;
        报错NoSuchElementException;
        迭代器遍历完毕,指针不会复位;
        循环中只能用一次next方法;
        迭代器遍历时,不能用集合的方法进行增加或者删除;
        实在要删除,使用迭代器自带的remove方法
        暂时当成结论记忆*/
        Collection<String> col = new ArrayList<>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("D");
        col.add("E");

        //获取迭代器对象
        //迭代器好比一个箭头,默认指向集合的0索引
        Iterator<String> iterator = col.iterator();
        //利用循环获取集合中的每一个元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//          System.out.println(iterator.next());

        }
    }
}
