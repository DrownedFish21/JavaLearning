import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


//键盘录入5个学生，存储到集合中
@SuppressWarnings("all")
public class demo7 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            collection.add(scan.next());
        }

        System.out.println(collection);
    }
}
