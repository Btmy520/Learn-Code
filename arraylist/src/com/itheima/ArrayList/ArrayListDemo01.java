package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建集合的对象
        //集合能随着长度变化而变化
        //泛型
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        boolean result = list.add("E");
        //无论输入什么都返回一个true
        System.out.println(result);
        System.out.println(list);
        //删除元素
        list.remove("D");
        System.out.println(list);
        //修改元素
        list.set(0, "AQW");
        System.out.println(list);
        //查找元素
        String sb = list.get(2);
        System.out.println(sb);
        //遍历元素长度
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            String str = list.get(i);
            System.out.print(str + " ");
        }

    }
}
