import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        Set<String> keySet = hashMap.keySet();
        Set<Map.Entry<String,String>> entries = hashMap.entrySet();
        hashMap.put("金士昌","少妇");
        hashMap.put("金少","少妇");
        hashMap.put("金士昌","人妻");
        String name = "金士昌";
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "干" + entry.getValue());
        }
    }
}
