package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A04_MapDemo04 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式
        //用lambda表达式遍历

        Map<String, String> map = new HashMap<>();


        //添加元素
        //键: 名人姓名
        //值: 名人名言
        map.put("鲁迅","gogogo");
        map.put("曹操","rush b");
        map.put("刘备","flashBoom");
        map.put("柯镇恶","看我眼色行事");

        //3.lambda表达式遍历map集合
        map.forEach((key,value)-> System.out.println(key + ":" + value));


    }
}
