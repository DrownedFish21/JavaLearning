import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Worker worker = new Worker();
        System.out.println("请输入工人姓名：");
        worker.setName(scan.next());
        System.out.println("请输入工人年龄：");
        worker.setYear(scan.nextInt());
        System.out.println("该工人对象的属性如下：");
        System.out.println("姓名："+worker.getName());
        System.out.println("工龄："+worker.getYear());
        Child child = new Child();
        child.Methord();
    }
}
class Worker{
    private String name;
    private int year;

    void Methord(){

    }
    private void Methord1(){

    }
    public void Methord2(){

    }
    public Worker(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Worker() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
class Child extends Worker{
    @Override
    public void Methord2() {
        super.Methord2();
    }

    @Override
    void Methord() {
        super.Methord();
    }


}
