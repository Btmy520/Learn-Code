package com.itheima.Test;

public class TestDemo03 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！
        以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        第10天的时候（还没吃），发现只剩下一个桃子了，请问，最初总共多少个桃子？

         day10: 1个

         day9: (day10 + 1) * 2

         day8: (day9 + 1) * 2


         */

        System.out.println(getPeach(1));


    }

    public static int getPeach(int day) {
        if (day <= 0 || day >= 11) {
            System.out.println("当前时间错误");
            return 0;
        }

        if (day == 10) {
            return 1;
        }

        return (getPeach(day + 1) + 1) * 2;
    }
}
