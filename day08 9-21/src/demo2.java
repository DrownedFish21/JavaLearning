import java.util.Comparator;
import java.util.TreeSet;

public class demo2 {

    TreeSet tree = new TreeSet(new Comparator<persion>() {
        @Override
        public int compare(persion o1, persion o2) {
            if(o1.num - o2.num == 0){
                return o1.age - o2.age;
            }
            else
                return o1.num - o2.num;
        }
    });
}
class persion{
    public int num;
    public int age;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
