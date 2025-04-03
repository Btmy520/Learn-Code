package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
        //设计一个账号输入系统,要求输入三次被锁定
        String setusername = "Btmy";
        String setpassword = "114514";

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            if(username.equals(setusername) && password.equals(setpassword)){
                System.out.println("登录成功,等待跳转界面..");
                break;
            }else if(i == 2){
                System.out.println("操作频繁,请稍后重试..");
            }else{

                System.out.println("用户登陆失败,您还有" + (2-i) + "次机会");
            }

        }

    }

}