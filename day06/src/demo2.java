import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scan.next();
        for (int i = 0; i < str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
