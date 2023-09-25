import java.util.Arrays;

public class demo6 {
    public static void main(String[] args) {
        A[] as = {new A("zzz"),new A("xxx"),new A("ccc"),new A("xxx"),new A("vvv")};
        int SavedNum = 0;
        A[] SaveA = new A[5];

        for (int i = 0; i < as.length; i++) {
            int count = 0;
            for (int j = 0; j < SavedNum; j++) {
                if(as[i].equals(as[j])){
                    SaveA[SavedNum++] = null;
                    break;
                }
                count++;
            }
            if(i==0 || count == SavedNum){
                SaveA[i] = as[i];
                SavedNum++;
            }
        }

        System.out.println(Arrays.toString(SaveA));
    }
}
class A{
    public String name;
    public A(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj instanceof A){
            return ((A) obj).name.equals(this.name);
        }
        return false;
    }
}
