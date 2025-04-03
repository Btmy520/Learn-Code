package com.itheima.ArrayList.Test;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(323);
        System.out.print("[");
        for (int i = 0; i < number.size(); i++) {
            if(i == number.size() - 1){
                System.out.print(number.get(i));
            }else {
                System.out.print(number.get(i) + ",");
            }
        }
        System.out.print("]");

    }
}
