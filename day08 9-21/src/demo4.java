import java.util.*;

/*
    斗地主案例：
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
    5.*发牌
 */
public class demo4 {
    public static void main(String[] args) {
        //准备牌
        //创建一个集合，相当于牌盒
        //键——编号，值——牌面
        HashMap<Integer, String> map = new HashMap<>();

        //创建集合存储编号
        ArrayList<Integer> list = new ArrayList<>();
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        int index = 0;
        map.put(index, "大王");
        list.add(index++);
        map.put(index, "小王");
        list.add(index++);
        //将花色点数组合(嵌套for)
        for (String num : nums) {
            for (String color : colors) {
                map.put(index, color + num);
                list.add(index++);
            }
        }
        //打乱编号
        Collections.shuffle(list);
        //发牌(3人)
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> lower = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i >= 51) {
                lower.add(list.get(i));
            } else if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }

        //看牌
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(lower);
        Look("金士昌：",player1,map);
        Look("少  妇：",player2,map);
        Look("人  妻：",player3,map);
        Look("底  牌：",lower,map);

    }
    public static void Look(String name,ArrayList<Integer> cards,HashMap<Integer,String> hashMap){
        System.out.print(name);
        for (Integer i : cards) {
            System.out.print(hashMap.get(i)+" ");
        }
        System.out.println();
    }
}
