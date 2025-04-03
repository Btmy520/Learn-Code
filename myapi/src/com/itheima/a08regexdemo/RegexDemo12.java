package com.itheima.a08regexdemo;

public class RegexDemo12 {
    public static void main(String[] args) {
        //需求1: 判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例:a123a b456b 17691 &abc& a123b(false)

        String Regex = "(.).+\\1";
        System.out.println("a123a".matches(Regex));
        System.out.println("b456b".matches(Regex));
        System.out.println("17691".matches(Regex));
        System.out.println("&abc&".matches(Regex));
        System.out.println("a123b".matches(Regex));
        System.out.println("-------------------------");

        //需求2: 判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例: abc123abc b456b 123789123 &!@abc&!@& abc123abd(false)
        String Regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(Regex2));
        System.out.println("b456b".matches(Regex2));
        System.out.println("123789123".matches(Regex2));
        System.out.println("&!@abc&!@&".matches(Regex2));
        System.out.println("abc123abd".matches(Regex2));
        System.out.println("-------------------------");

        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例:aaa123aaa bbb456bbb 111789111 &&abc&&1
        String Regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(Regex3));
        System.out.println("bbb456bbb".matches(Regex3));
        System.out.println("111789111".matches(Regex3));
        System.out.println("&&abc&&".matches(Regex3));

        System.out.println("-------------------------");
    }
}
