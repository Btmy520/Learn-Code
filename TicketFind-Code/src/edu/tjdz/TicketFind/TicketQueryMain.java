package edu.tjdz.TicketFind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketQueryMain {
    public static void main(String[] args) {
        // 初始化车次数据
        List<String> list = new ArrayList<>();
        list.add("T40,长春,北京,00:12,12:20,12:08");
        list.add("T298,杭州,北京,00:06,10:50,10:44");
        list.add("Z158,大连,北京,12:48,21:06,08:18");
        list.add("K084,长春,北京,12:39,02:16,13:37");

        // 定义标题数组
        String[] title = {"车次", "出发站", "到达站", "出发时间", "到达时间", "历时"};

        // 显示所有车次信息
        System.out.println("=================== 所有车次信息 ===================");
        for (String str : title) {
            System.out.print(str + "\t");
        }
        System.out.println("\n" + "=".repeat(50));
        for (String ticket : list) {
            String[] info = ticket.split(",");
            for (String str : info) {
                System.out.print(str + "\t");
            }
            System.out.println();
        }

        // 车次查询功能
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=================== 车次查询 ===================");
            System.out.print("请输入车次（输入 exit 退出）:");
            String ticketId = sc.next().trim();
            if ("exit".equalsIgnoreCase(ticketId)) break;

            boolean found = false;
            // 输出标题
            for (String str : title) {
                System.out.print(str + "\t");
            }
            System.out.println("\n" + "-".repeat(50));

            // 遍历查询
            for (String ticket : list) {
                String[] info = ticket.split(",");
                if (info[0].equals(ticketId)) {
                    for (String str : info) {
                        System.out.print(str + "\t");
                    }
                    System.out.println();
                    found = true;
                    break; // 找到后直接退出循环
                }
            }

            if (!found) {
                System.out.println("【错误】车次 '" + ticketId + "' 不存在！");
            }
        }
        sc.close();
        System.out.println("程序已退出");
    }
}