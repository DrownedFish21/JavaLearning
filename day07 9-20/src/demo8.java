import java.util.ArrayList;
import java.util.Iterator;

public class demo8 {
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(5);
        c.add(6);
        c.add(3);
        c.add(9);
        
        Iterator<Integer> iterator = c.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if(obj.equals(3)){
                iterator.remove();
            }
        }
        System.out.println(c);


        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i : arr) {
            System.out.println(i);
        }

        for (Integer i : c) {
            System.out.println(i);
        }

    }
}
