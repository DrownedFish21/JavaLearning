import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*录入出生日期，显示存活时间*/
public class demo4 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入出生日期（xxxx年xx月xx日）：");
        String s = scan.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(s);
        System.out.println(date.getTime());
    }
}
