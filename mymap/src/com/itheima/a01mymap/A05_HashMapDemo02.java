package com.itheima.a01mymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class A05_HashMapDemo02 {
    public static void main(String[] args) {
        /*
        某个班级80名学生，现在需要组成秋游活动，
        班长提供了四个景点依次是（A、B、C、D），
        每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */

        String[] students = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(students.length);
            list.add(students[index]);
        }

        //2,如果统计目标较多,不适用计数器思想
        // 3,使用Map集合统计

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            Integer count = map.get(s);
            if (count == null) {
                map.put(s, 1);
            } else {
                map.put(s, count + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }

    }

}
