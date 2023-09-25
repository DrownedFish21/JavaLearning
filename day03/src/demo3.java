public class demo3 {
    private static int a;
    private static int b;
    public static void main(String[] args) {
        a = 3;
        b = 4;
        Swap(a,b);
        System.out.println(a+""+b);
    }
    public static void Swap(Integer x,Integer y){
        a = y;
        b = x;
    }
}