/*
  将手机号的中间四位隐藏
  例如：18836190933 ——> 188****0933
*/
public class demo1 {
    public static void main(String[] args) {
        long phoneNum = 18736190932L;
        String value = String.valueOf(phoneNum);
        String replace = value.replace(value.substring(3, 7), "****");
        System.out.println(replace);
    }
}
