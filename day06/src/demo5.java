import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("all")
public class demo5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(arrayList);
    }
}
