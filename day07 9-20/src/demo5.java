import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/*集合的使用*/


public class demo5 {
    public static void main(String[] args) {
        //使用多态创建对象
        //父类 new 子类
        Collection<Object> c = new ArrayList<>();
        c.add(123);
        c.add(4.3);
        c.add("abc");
        c.add('d');
        c.add(true);
        System.out.println(c.size());
        System.out.println(c);
        String str ="";
        System.out.println(str.split(",").length);

    }
}
