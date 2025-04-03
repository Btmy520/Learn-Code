package edu.tjdz.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String str = new String("2025-11-11");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf1.parse(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str1 = sdf2.format(d);
        System.out.println(str1);
    }
}
