package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo02 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式
        //创建Map对象
        Map<String, String> map = new HashMap<>();
        //添加元素
        map.put("Bt","my");
        map.put("nine", "zed");
        map.put("dove" , "steve");

        //3.通过键找值

        //3.1获取所有的键, 把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();
        for (String key : keys) {
//            System.out.println(key);

            String value = map.get(key);
            System.out.println(key + value);

        }
    }
}
