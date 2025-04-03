package edu.tjdz.a01integerdemo;

public class A02_IntegerDemo02 {
    public static void main(String[] args) {
        //进制之间转换
        String str1 = Integer.toBinaryString(10);
        System.out.println(str1);

        System.out.println("===================================");

        String str2 = Integer.toOctalString(10);
        System.out.println(str2);

        System.out.println("===================================");

        String str3 = Integer.toHexString(10);
        System.out.println(str3);

        System.out.println("===================================");

        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }
}
