package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo03 {
    public static void main(String[] args) {

//              Collection系列集合三种通用的遍历方式：
//        1.迭代器遍历
//        2.增强for遍历
//        3.lambda表达式遍历
//              迭代器遍历相关的三个方法：
//        Iterator<E>iterator(）：获取一个迭代器对象
//        boolean hasNext()：判断当前指向的位置是否有元素
//        E next()：获取当前指向的元素并移动指针
        Collection<String> col = new ArrayList<>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("D");

        //获取迭代器对象
        //迭代器好比一个箭头,默认指向集合的0索引
        Iterator<String> iterator = col.iterator();
        //利用循环获取集合中的每一个元素
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //当上方循环结束之后,迭代器指针已经没有元素的位置了
        //迭代器遍历完毕过后指针不会复位
        //
    }
}
