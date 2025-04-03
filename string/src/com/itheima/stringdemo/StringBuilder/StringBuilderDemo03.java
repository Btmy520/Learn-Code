package com.itheima.stringdemo.StringBuilder;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};

        String result = intToString(num);

        System.out.println(result);
    }
    public static String intToString(int[] num) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //循环判断是否为最后一位是否要加入逗号
        for (int i = 0; i < num.length; i++) {
            if(i == num.length - 1){
                sb.append(num[i]);
            }else{
                sb.append(num[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}
