package com.itheima.ArrayList.Test;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Test04 {
    ///求
    ///1，main方法中定义一个集合，存入三个用户对象。
    ///用户属性为:id，username，password
    ///2，要求:定义一个方法，根据id查找对应的用户信息，
    ///如果存在，返回true
    ///如果不存在，返回false
    public static void main(String[] args) {
        ArrayList<User> List = new ArrayList<>();

        User userA = new User("BTMY1", "123123", "BTMY520");
        User userB = new User("BTMY2", "123123", "BTMY521");
        User userC = new User("BTMY3", "123123", "BTMY522");

        List.add(userA);
        List.add(userB);
        List.add(userC);

        boolean flag = getid02(List);
        System.out.println(flag);

        //相当于门禁
    //实现判断id是否在集合内
    //需要让输入id = 集合内id 并输出true
    //否则输出felse
    }
    public static String getid(ArrayList<User> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the user");
        String userid = sc.next();
        for (int i = 0; i < List.size(); i++) {
            if (userid.equals(List.get(i).getId())){
                System.out.println("true");
                break;
            }
            System.out.println("false");
            break;
        }

       return userid;

    }

    public static boolean getid02(ArrayList<User> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the user");
        String userid = sc.next();
        for (int i = 0; i < List.size(); i++) {
            User u = List.get(i);
            String uid = u.getId();
            if (uid.equals(userid)){
                return true;
            }
        }
        return false;
    }

    public static boolean getid03(ArrayList<User> List){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the user");
        String userid = sc.next();
        for (;;){
            for (int i = 0; i < List.size(); i++) {
                User u = List.get(i);
                String uid = u.getId();
                if (uid.equals(userid)){
                    return true;
                }
            }
        }

    }
}
