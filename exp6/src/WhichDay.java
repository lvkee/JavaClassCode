//: exp6:WhichDay.java

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Author:ChrisLiu
 * Email:ChrisLiu0810@163.com
 */
public class WhichDay {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("请按年 月 日输入日期 : ");
        String year = in.next();
        String month = in.next();
        String day = in.next();

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy MM dd");

        Date d = fmt.parse(year + " " + month + " " + day);
        //输出周几
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E");
        System.out.println("这一天是：" + simpleDateFormat.format(d));
        //输出星期几
        simpleDateFormat = new SimpleDateFormat("EEEE");
        System.out.println("这一天是：" + simpleDateFormat.format(d));
        //输出这周的第几天
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        System.out.println("这是第" + calendar.get(Calendar.DAY_OF_WEEK) + "天");
    }
}
