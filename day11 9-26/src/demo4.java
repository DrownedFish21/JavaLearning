import java.util.function.Consumer;
import java.util.function.Supplier;

//函数式接口 Supplier
public class demo4 {
    public static void main(String[] args) {
        int[] arr = {15,30,25,5,4,39};
        System.out.println(getMax(() -> {
            int max = arr[0];
            for (int j : arr) {
                if (j > max) {
                    max = j;
                }
            }
            return max;
        }));
        findMax(arr,System.out::println);

        System.out.println(findMax(arr));
    }
    static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
    static void findMax(int[] ints, Consumer<Integer> con){
        int max = ints[0];
        for (int i : ints) {
            if(i > max){
                max = i;
            }
        }
        con.accept(max);
    }
    static Consumer<Integer> findMax(int[] ints) {
        int max = ints[0];
        for (int i : ints) {
            if(i > max){
                max = i;
            }
        }
        int finalMax = max;
        return integer -> integer = finalMax;
    }

}

