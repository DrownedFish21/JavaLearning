import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scan.next();
        String reg_phone = "^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$";
        boolean flag = str.matches(reg_phone);
        if(flag){
            System.out.println("成功");
        }
        else {
            System.out.println("失败");
        }
    }
}
