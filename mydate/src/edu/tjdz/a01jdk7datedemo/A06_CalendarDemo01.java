package edu.tjdz.a01jdk7datedemo;

import java.util.Calendar;

public class A06_CalendarDemo01 {
    public static void main(String[] args) {
        //根据系统不同时区,获取不同的日历对象
        //会把时间中的各种信息都放到一个数组当中
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
