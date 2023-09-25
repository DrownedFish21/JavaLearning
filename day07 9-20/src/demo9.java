import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class demo9 {
    public static void main(String[] args) {

        Integer[] num = {1,2,3,4,5};
        //Arrays.sort(num,(m1,m2)->m1-m2);
        Arrays.sort(num, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(num));
    }
}
