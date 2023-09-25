import java.util.Calendar;

public class demo3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //获取日历中的数字
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+" "+(month+1)+" "+day+" "+(week-1));
    }
}
