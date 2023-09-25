import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class demo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(!list.contains((str))){
                list.add(str);
            }
        }
    }
}
class A{

}
