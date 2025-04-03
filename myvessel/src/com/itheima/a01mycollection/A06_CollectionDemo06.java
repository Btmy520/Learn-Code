package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A06_CollectionDemo06 {
    public static void main(String[] args) {
        /*增强for遍历

                for(数据类型 变量名 : 集合/数组){
                }*/

        //1.创建集合添加元素
        Collection<String> col = new ArrayList<>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("D");

        //使用增强for格式进行遍历
        /// 注意点
        /// s其实就是一个第三方变量, 在循环的过程中一次表示集合中的每一个数据
        for (String s : col) {
            //s : 第三方变量名
            System.out.println(s);
        }
//        快捷键: col.for

    }
}
