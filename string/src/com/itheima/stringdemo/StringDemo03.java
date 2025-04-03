package com.itheima.stringdemo;

public class StringDemo03 {
    public static void main(String[] args) {
        //定义一个方法，把Int数组中的数据按照指定的格式拼接成一个字符串返回
        //调用该方法，并在控制台输出结果，
        //例如输入123变成[1, 2, 3]
        int[] arr = {1,2,3};

        String str = arrString(arr);

        System.out.println(arrString(arr));


    }

    public static String arrString(int[] arr){
        if(arr == null){
            System.out.println("null");
        }
        if(arr.length == 0){
            System.out.println("empty");
        }


        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if(i == arr.length - 1){

            }else{
                result += ", ";
            }
        }
        return  result + "]";
    }
}
