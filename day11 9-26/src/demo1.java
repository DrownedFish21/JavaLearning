import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Date;
/*
    时间类
 */
public class demo1 {
    public static void main(String[] args) {
        Date date = new Date();

        //使用SimpleDateFormat格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        //LocalDateTime获取当前时间
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = time.format(d);
        System.out.println(format);

        //增加日期
        LocalDateTime timePlus10 = time.plusYears(10);
        System.out.println("timePlus10 = " + timePlus10.format(d));

        //减少日期
        LocalDateTime timeMinus20 = time.minusYears(20);
        System.out.println("timeMinus20 = " + timeMinus20.format(d));

        //修改日期
        LocalDateTime timeWith1999 = time.withYear(1999);
        System.out.println("timeWith1999 = " + timeWith1999.format(d));

        System.out.println(LocalDateTime.now().withYear(1982).withMonth(1).withDayOfMonth(1).format(d));


    }
}
