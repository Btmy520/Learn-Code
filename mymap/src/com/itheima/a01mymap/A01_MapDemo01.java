package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo01 {
    public static void main(String[] args) {

        /*
            V put(k key,V value)
            V remove(Object key)
            void clear()
            boolean containsKey(Object key)
            boolean containsValue(Object value)
            boolean isEmpty()
            int size()

            添加元素
            根据键删除键值对元素
            移除所有的键值对元素
            判断集合是否包含指定的键
            判断集合是否包含指定的值
            判断集合是否为空
            集合的长度，也就是集合中键值对的个数
        */

        //创建map集合的对象
        Map<String, String> m = new HashMap<>();
        //添加元素
        //put方法细节:
        //添加和覆盖

        //再添加数据的是否如果键值不存在,那么直接把键值对对象添加到map集合当中
        //在添加数据的时候如果键值是存在的,那么会把原有的键值覆盖,就会把覆盖的返回


        m.put("Bt","my");
        m.put("nine", "zed");
        m.put("dove" , "steve");
//        String value1 = m.put("Bt","my");
//        System.out.println(value1);
//        String value2 = m.put("dove" , "sb");
//        System.out.println(value2);


//        删除指定元素
//        String result = m.remove("Bt");
//        System.out.println(result);
//        清空
//        m.clear();

//        判断是否包含
//        boolean keyResult = m.containsKey("Bt");
//        System.out.println(keyResult);
//        boolean valueResult = m.containsValue("my");
//        System.out.println(valueResult);

//        boolean result = m.isEmpty();
//        System.out.println(result);

        long size = m.size();
        System.out.println(size);
//        打印集合
//        System.out.println(m);





    }
}
