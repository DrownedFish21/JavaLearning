import java.util.*;

/*
    Collections工具类
*/
@SuppressWarnings("ALL")
public class demo6 {
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(5);
        c.add(6);
        c.add(2);
        c.add(9);
        Collections.reverse(c);
        System.out.println(c);
        Collections.sort(c);
        System.out.println(c);

        //将数组中的元素全部添加到集合中
       /* int[] arr = {1,2,3,5,6,4,2};
        for (int i = 0; i < arr.length; i++) {
            c.add(arr[i]);
        }*/
        int[] arr = {1,2,3,5,6,4,2};
        ArrayList list = new ArrayList();

        Collections.addAll(list,Arrays.toString(arr));
        System.out.println(list);

    }
}
