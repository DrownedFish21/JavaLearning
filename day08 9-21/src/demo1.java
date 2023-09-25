import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class demo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2050, Calendar.MAY,1);
        System.out.println(calendar.get(Calendar.MONTH)+1);
    }
}
class pa implements Comparator<pa>{

    @Override
    public int compare(pa o1, pa o2) {
        return 0;
    }
}
