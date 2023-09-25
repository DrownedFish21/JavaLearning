import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num >= 100 && num <=999)
        {
            int bai = num / 100 % 10;
            int shi = num / 10 % 10;
            int ge = num % 10;
            System.out.println(bai);
            System.out.println(shi);
            System.out.println(ge);
            System.out.println(bai + shi + ge);
        }
        else
        {
            System.out.println("请输入三位数");
        }

    }
}

