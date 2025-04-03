package edu.tjdz.a01jdk8datedemo;

import java.time.Instant;

public class A01_ZoneIdDemo02 {
    public static void main(String[] args) {
        /*
        static Instant now()
        获取当前时间的Instant对象（标准时间)

        static Instant ofXxxx(long epochMilli)
        根据（秒/毫秒/纳秒）获取Instant对象

        ZonedDateTime atZone(ZoneId zone)
        指定时区

        boolean isXxx(Instant otherInstant)
        判断系列的方法

        Instant minusXxx(long millisToSubtract)
        减少时间系列的方法

        Instant plusXxx(long millisToSubtract)
        增加时间系列的方法
        */
        Instant now = Instant.now();
        System.out.println(now);

        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);
        System.out.println(now.isAfter(instant1));

        Instant instant2 = Instant.ofEpochMilli(now.toEpochMilli());
        System.out.println(instant2);
        System.out.println(now.isAfter(instant2));

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000L);
        System.out.println(instant3);
        System.out.println(now.isAfter(instant3));



    }
}
