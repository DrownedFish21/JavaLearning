import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args) {
        FindMax findMax = new FindMax();
        ArrayList<Integer> nums = new ArrayList<>();
        nums = findMax.InputNumsToArrayList();
        System.out.println(findMax.FindMaxInArrayList(nums));
    }

}
class FindMax{
    public ArrayList<Integer> InputNumsToArrayList(){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            nums.add(scan.nextInt());
        }
        return nums;
    }
    public Integer FindMaxInArrayList(ArrayList<Integer> arrayList){
        Integer max = Integer.MIN_VALUE;
        for (Integer i:arrayList) {
            if(i > max)
            {
                max = i;
            }
        }
        return max;
    }
}

