import java.util.*;
import java.util.function.Consumer;

//函数时接口  Consumer
public class demo5 {
    public static void main(String[] args) {
        ConsumerStr(System.out::println);
        ConsumerStr(System.out::println,
                s -> System.out.println(new StringBuilder(s).reverse()));

        String[] strings = {"狗蛋", "麻球", "胡猪"};
        ConsumerStr(strings,
                str -> System.out.println("姓名：" + str));
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        FindMax(arrayList, System.out::println);
    }

    //用不同的方式消费同一个字符串两次
    static void ConsumerStr(Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept("狗蛋");
    }

    //消费一个字符串
    static void ConsumerStr(Consumer<String> con) {
        con.accept("李刚");
    }

    static void ConsumerStr(String[] strs, Consumer<String> con1) {
        for (String str : strs) {
            con1.accept(str);
        }
    }

    static void FindMax(ArrayList<Integer> arrayList, Consumer<Integer> con) {
        Integer max = arrayList.get(0);
        for (Integer i : arrayList) {
            if(i > max){
                max = arrayList.get(i);
            }
        }
        con.accept(max);
    }
}
