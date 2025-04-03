package com.itheima.mysort;

public class A04_RecursionDemo03 {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    public static int getFactorial(int num){
        if(num == 1){
            return 1;
        }

        return num * getFactorial(num - 1);
    }
}
