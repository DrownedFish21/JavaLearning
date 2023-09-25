import java.io.File;
import java.util.Scanner;

public class demo2 {
   static long size = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.next();
        File file = new File(path);
        CS(file);
        System.out.println("总大小" + size);
    }
    public static void CS(File file){
        if(file == null){
            return;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                CS(f);
            }
            if(f.isFile()){
                System.out.println(f.getName()+" "+f.length());
                size+=f.length();
            }

        }
    }
}

