package edu.tjdz.TicketFind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketQuerySystem {
    // 类常量定义标题，避免硬编码
    private static final String[] TITLE = {"车次", "出发站", "到达站", "出发时间", "到达时间", "历时"};

    public static void main(String[] args) {
        List<String> tickets = initTicketData();
        displayAllTickets(tickets);

        Scanner scanner = new Scanner(System.in);
        queryTicketLoop(scanner, tickets);
        scanner.close();

        System.out.println("程序已退出");
    }

    // 初始化车次数据
    private static List<String> initTicketData() {
        List<String> list = new ArrayList<>();
        list.add("T40,长春,北京,00:12,12:20,12:08");
        list.add("T298,杭州,北京,00:06,10:50,10:44");
        list.add("Z158,大连,北京,12:48,21:06,08:18");
        list.add("K084,长春,北京,12:39,02:16,13:37");
        return list;
    }

    // 显示所有车次信息
    private static void displayAllTickets(List<String> tickets) {
        System.out.println("\n=================== 所有车次信息 ===================");
        printTitle();
        System.out.println("=".repeat(60));
        for (String ticket : tickets) {
            printTicketInfo(ticket);
        }
    }

    // 循环查询逻辑
    private static void queryTicketLoop(Scanner scanner, List<String> tickets) {
        while (true) {
            System.out.println("\n=================== 车次查询 ===================");
            System.out.print("请输入车次（输入 exit 退出）:");
            String input = scanner.next().trim();

            if (isExitCommand(input)) break;
            processTicketQuery(input, tickets);
        }
    }

    // 判断退出指令
    private static boolean isExitCommand(String input) {
        return "exit".equalsIgnoreCase(input);
    }

    // 处理单次查询
    private static void processTicketQuery(String ticketId, List<String> tickets) {
        boolean found = false;
        printTitle();
        System.out.println("-".repeat(60));

        for (String ticket : tickets) {
            String[] info = ticket.split(",");
            if (info[0].equals(ticketId)) {
                printTicketInfo(ticket);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("【错误】车次 '" + ticketId + "' 不存在！");
        }
    }

    // 打印标题行
    private static void printTitle() {
        for (String str : TITLE) {
            System.out.print(str + "\t");
        }
        System.out.println();
    }

    // 打印单个车次信息
    private static void printTicketInfo(String ticket) {
        String[] info = ticket.split(",");
        for (String str : info) {
            System.out.print(str + "\t");
        }
        System.out.println();
    }
}