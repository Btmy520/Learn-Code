package com.itheima.stringdemo;

public class StringDemo07 {
    public static void main(String[] args) {
        //从身份信息中获取到出生日期并且输出
        String id = "441581200701075131";
        String brithyear = id.substring(6, 10);
        String brithmonth = id.substring(10,12);
        String brithday = id.substring(12,14);
        System.out.println(brithyear + "/" + brithmonth + "/" + brithday);

        //获取性别并且判断性别
        char sex = id.charAt(16);
        if(sex % 2 == 0) {
            System.out.println(id + "为女性");

        }else{
            System.out.println(id + "为男性");
        }
    }
}
