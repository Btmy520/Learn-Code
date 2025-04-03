package edu.tjdz.a01jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIdDemo01 {
    public static void main(String[] args) {
        /*static Set<String> getAvailableZoneIds()
        获取Java中支持的所有时区
        static ZoneId systemDefault()
        获取系统默认时区
        static ZoneId of(String zoneId)
        获取一个指定时区*/


        /*Set<String> set = ZoneId.getAvailableZoneIds();
        System.out.println(set);
        System.out.println(set.size());*/

        /*ZoneId zid = ZoneId.systemDefault();
        System.out.println(zid);*/

        /*ZoneId zid = ZoneId.of("Asia/Taipei");
        System.out.println(zid);
        System.out.println(zid.getRules());*/
    }
}
