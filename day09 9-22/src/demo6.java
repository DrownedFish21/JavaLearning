import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        File file = new File("b.text");
        boolean b = file.createNewFile();
        FileOutputStream fos = new FileOutputStream("b.text",true);
        String str = scan.next();

        fos.write(str.getBytes());
        fos.close();
    }
}
