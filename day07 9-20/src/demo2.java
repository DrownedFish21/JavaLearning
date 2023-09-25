import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    日期类使用
*/
public class demo2 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String str = "2012-03-12 13:12:23";
        System.out.println(sdf.parse(str));

    }
}
