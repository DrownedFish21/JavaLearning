import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        boolean b = file.createNewFile();
        FileInputStream fis = new FileInputStream("b.text");
        FileOutputStream fos = new FileOutputStream("a.txt");

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
