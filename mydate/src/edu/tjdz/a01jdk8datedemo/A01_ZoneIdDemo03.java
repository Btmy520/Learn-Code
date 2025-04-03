package edu.tjdz.a01jdk8datedemo;

public class A01_ZoneIdDemo03 {
    public static void main(String[] args) {
        /*
        static ZonedDateTime now()
        获取当前时间的ZonedDateTime对象
        static ZonedDateTime ofXxxx(。。。)
        获取指定时间的ZonedDateTime对象
        ZonedDateTime withXxx(时间)
        修改时间系列的方法
        ZonedDateTime minusXxx(时间)
        减少时间系列的方法
        ZonedDateTime plusXxx(时间)
        增加时间系列的方法
        */

        //细节：
        //JDK8新增的时间对象都是不可变的
        //如果我们修改了，减少了，增加了时间
        //那么调用者是不会发生改变的，产生一个新的时间。
    }
}
