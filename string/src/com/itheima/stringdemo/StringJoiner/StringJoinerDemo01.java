package com.itheima.stringdemo.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo01 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(";",",",".");

        sj.add("abcdefg").add("123123");
        System.out.println(sj.toString());
    }
}
