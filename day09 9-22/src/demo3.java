import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\24964\\Desktop\\test\\test1.txt");
        int read = is.read();
        System.out.println(read);
        is.close();
    }

}
