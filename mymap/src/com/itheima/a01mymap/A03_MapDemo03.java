package com.itheima.a01mymap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A03_MapDemo03 {
    public static void main(String[] args) {

        //创建Map对象
        Map<String, String> map = new HashMap<>();
        //添加元素
        //键:人物外号
        //值:人物名称
        map.put("嫉妒魔女","莎提拉");
        map.put("终蔫之兽", "帕克");
        map.put("傲慢大罪司教", "菜月昴");

        //Map集合的第二种遍历方式
        //通过键值对遍历
        //3.1 通过一个方法获取所有键值对对象, 会返回一个Set集合
        //如果没有import java.util.Map.Entry; 必须要在前面加上Map.

        // 三个课堂练习：
        // 练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        // 练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        // 练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历

        Set<Entry<String ,String>> entries = map.entrySet();
        //利用增强for循环遍历,去得到里面每一个键值对的值
        for (Entry<String, String> entry : entries) {
            //3.3 利用entry调用get方法调用键和值
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + value);
        }


    }
}
