package com.itheima.stringdemo;

public class StringDemo08 {
    public static void main(String[] args) {
        //屏蔽敏感词
        //获取所说的话
        //rep
        String talk = "cnmd玩的什么jb";

        String[] arr = {"cnmd", "jb", "wdnmd"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "****");

        }



        System.out.println(talk);
    }
}
