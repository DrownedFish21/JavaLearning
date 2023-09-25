import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\24964\\Desktop\\test");
        ListFile(file);

       /* File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f);
            if(f.isDirectory()){
                File file1 = new File(String.valueOf(f));
                File[] file2 = file1.listFiles();
                for (File f1 : file2){
                    System.out.println(f1);
                }
            }
        }
    }*/
    }
    public static void ListFile(File file){
        File[] files = file.listFiles();
        assert files != null;
        for (File f : files){
            System.out.println(f);
            if(f.isDirectory()){
                ListFile(f);
            }
        }
    }
}

