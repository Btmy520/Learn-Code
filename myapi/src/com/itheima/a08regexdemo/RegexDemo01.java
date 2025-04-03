package com.itheima.a08regexdemo;

public class RegexDemo01 {
    /*
    假如现在要求校验一个QQ号码是否正确。
    规则：6位及20位之内，0不能在开头，必须全部是数字。
    先使用目前所学知识完成校验需求
    然后体验一下正则表达式检验.*/
    public static void main(String[] args) {
        extracted();
//        ctrl + alt + m抽取为方法
    }

    private static void extracted() {
        String qq = "023456";
        if (qq.length() >= 6 && qq.length() <= 20 && !qq.startsWith("0") && qq.matches("[0-9]+")) {
            System.out.println("校验通过");
        } else {
            System.out.println("校验不通过");
        }
    }
}
