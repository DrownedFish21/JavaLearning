import java.io.*;

/*
    缓冲流
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        noVip();
    }
    static void noVip() throws IOException{
        long start = System.currentTimeMillis();
        FileWriter fw = new FileWriter("手工案例部分.docx");
        FileReader fr = new FileReader("C:\\Users\\24964\\Desktop\\临时文件\\手工案例部分.docx");
        int read;
        while ((read=fr.read())!=-1){
            fw.write(read);
        }
        fw.close();
        fr.close();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - start));
    }
    static void vip() throws IOException{
        long start = System.currentTimeMillis();
        FileWriter fw = new FileWriter("手工案例部分.docx");
        FileReader fr = new FileReader("C:\\Users\\24964\\Desktop\\临时文件\\手工案例部分.docx");
        char[] bytes = new char[1024];
        int read;
        while ((read=fr.read(bytes))!=-1){
            fw.write(bytes,0,read);
        }
        fw.close();
        fr.close();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - start));
    }
    static void svip() throws IOException{
        long start = System.currentTimeMillis();
        FileWriter fis = new FileWriter("手工案例部分.docx");
        BufferedWriter bw = new BufferedWriter(fis);
        FileReader fr = new FileReader("C:\\Users\\24964\\Desktop\\临时文件\\手工案例部分.docx");
        BufferedReader br = new BufferedReader(fr);
        char[] bytes = new char[1024];
        int read;
        while ((read=br.read(bytes))!=-1){
            bw.write(bytes,0,read);
        }
        bw.close();

        fis.close();
        br.close();
        fr.close();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - start));
    }


}
