import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\24964\\Desktop\\test\\test1.txt");
        FileInputStream fis = new FileInputStream("C:\\Users\\24964\\Desktop\\test\\test1.txt");
        byte[] bytes = new byte[(int) file.length()];
        String str = new String(bytes, 0, fis.read(bytes));
        System.out.println(str);
        fis.close();
    }

}
