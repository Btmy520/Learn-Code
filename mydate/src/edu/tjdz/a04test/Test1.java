package edu.tjdz.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if (num < 1 || num > 100){
                System.out.println("该数字不在指定范围内,请重新输入");
                continue;
            }
            //添加到集合中
            //细节
            //num:基本数据类型
            //在添加数据的时候调用了自动装箱
            list.add(num);
            //统计集合中的数据和
            int sum = getSum(list);
            //对sum进行判断
            if (sum > 200){
                System.out.println("数据总和大于200,退出程序");
                break;
            }
        }
    }

    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
