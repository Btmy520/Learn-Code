package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo05 {
    public static void main(String[] args) {
        //键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        //判断金额是否为有效金额
        while (true) {
            System.out.println("输入一个金额");
            money = sc.nextInt();
            if(money >= 0 && money <= 99999999){
                break;

            }else{
                System.out.println("无效金额");
            }
        }
        //从金额个位数开始变化
        String moneyStr = "";
        while(true){
            //先取个位数
            int ge = money % 10;
            //去掉获取的数字
            money = money / 10;
            //拼接字符串
            String capNumber= getCapNumber(ge);
            moneyStr = capNumber + moneyStr;
            //如果数字上的全部获取到了,那么为零,停止循环
            if(money == 0){
                break;
            }
        }
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);

        //定义一个数组
        //记录金额单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元",};
        //单位数列
        for (int i = 0; i < arr.length; i++) {
            char c = moneyStr.charAt(0);
            System.out.print(c);
            System.out.print(arr[i]);
        }

    }


    public static String getCapNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖",};
        return arr[number];
    }
}
