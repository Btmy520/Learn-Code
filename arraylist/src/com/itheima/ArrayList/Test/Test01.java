package com.itheima.ArrayList.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> ArL = new ArrayList<>();
        ArL.add("A");
        ArL.add("B");
        ArL.add("C");
        StringJoiner sj = new StringJoiner(",", "[" ,"]");
            sj.add(ArL.get(0));
            sj.add(ArL.get(1));
            sj.add(ArL.get(2));

        System.out.print(sj.toString());


        ///课上教学方法///
        System.out.println();

        System.out.print("[");
        for (int i = 0; i < ArL.size(); i++) {
            if(i == ArL.size() - 1){
                System.out.print(ArL.get(i));
            }else {
                System.out.print(ArL.get(i) + ",");
            }
        }
        System.out.print("]");

    }
}
