import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scan.next();
        String newStr="";
        if(str.contains("TMD")){
            newStr = str.replace("TMD","***");
        }
        System.out.println(newStr);
    }
}

