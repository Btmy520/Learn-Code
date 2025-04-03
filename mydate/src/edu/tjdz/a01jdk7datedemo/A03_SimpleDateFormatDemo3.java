package edu.tjdz.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        //
        String startStr = "2025年11月11日 0:0:0";
        String endStr = "2025年11月11日 0:10:0";
        String orderStr = "2025年11月11日 0:10:0";

        // 将字符串转换成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //获得三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        // 判断订单是否在活动范围内
        if(orderTime >= startTime && orderTime <= endTime){
            System.out.println("在范围内");
        }else{
            System.out.println("不在范围内");
        }

        // 判断订单是否在活动范围内
        if(orderDate.after(startDate) && orderDate.before(endDate)){
            System.out.println("在范围内");
        }else{
            System.out.println("不在范围内");
        }
    }
}
