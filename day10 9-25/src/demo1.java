import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
    字符流和字符流在写数据时，并不是直接写入目标文件，而是先暂时存放到缓冲区。
    字节流的缓冲区大小可以忽略不计。
    字符流的缓冲区比较大，要刷新
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        String str = "good";
        fos.write(str.getBytes());
        fos.flush();
        fos.close();

        FileWriter fw = new FileWriter("a.txt");
        String str1 = "better";
        fw.write(str1);
        fw.flush();
        fw.close();
    }
}
