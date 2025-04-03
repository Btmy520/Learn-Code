package edu.tjdz.a01jdk8datedemo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DataTimeFormatterDemo {
    public static void main(String[] args) {
     /*
            static DateTimeFormatter ofPattern(格式)
            获取格式对象
            String format(时间对象)
            按照指定方式格式化
            */
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒 a");

        System.out.println(dtf.format(zdt));

    }

}
