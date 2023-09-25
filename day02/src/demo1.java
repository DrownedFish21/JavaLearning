import java.io.IOException;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) throws IOException {
        int level;
        Scanner scan = new Scanner(System.in);
        level = scan.nextInt();

        if(level >= 0 && level < 500){
            System.out.println("黑铁");
        }
        else if(level >=500 && level <800)
        {
            System.out.println("青铜");
        }
        else if(level >=800 && level <1000)
        {
            System.out.println("白银");
        }
        else if(level >=1000 && level <1200)
        {
            System.out.println("黄金");
        }
        else if(level >=1200 && level <1400)
        {
            System.out.println("铂金");
        }
        else if(level >=1400 && level <1600)
        {
            System.out.println("钻石");
        }
        else if(level >=1600 && level <1800)
        {
            System.out.println("大师");
        }
        else if(level >=1800 && level <2000)
        {
            System.out.println("宗师");
        }
        else if(level >2000) {
            System.out.println("王者");
        }

    }
}

