import java.util.Arrays;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        for (int i = 0;i < num.length;){
            System.out.println("请输入学生成绩：");
            int score = scan.nextInt();
            if(score < 0 || score > 100){
                System.out.println("无效成绩");
                continue;
            }
            num[i] = score;
            sum+=score;
            i++;
        }
        System.out.println((double) sum/num.length);
    }
}
