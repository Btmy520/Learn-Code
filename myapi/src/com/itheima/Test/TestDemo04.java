package com.itheima.Test;

public class TestDemo04 {
    public static void main(String[] args) {
        /*可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有100个台阶，小明一共有多少种爬法呢？
        运算结果：
        1层台阶 1种爬法
        7层台阶 21种爬法
        2层台阶 2种爬法*/

        System.out.println(getCount(20));
    }

    public static int getCount(int rank) {
        if (rank == 1) {
            return 1;
        }

        if (rank == 2) {
            return 2;
        }

        return getCount(rank - 1) + getCount(rank - 2);
    }
}
