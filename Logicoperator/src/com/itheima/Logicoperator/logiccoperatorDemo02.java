package com.itheima.Logicoperator;

public class logiccoperatorDemo02 {
    public static void main(String[] args) {
        // ^ 异或
        //相同为false,不相同为true
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);
        System.out.println("\t\t\t");

        //! 逻辑非 取反
        //不需要输入多次感叹号
        System.out.println(!true);
        System.out.println(!false);

    }
}
