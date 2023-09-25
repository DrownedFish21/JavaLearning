import java.util.TreeSet;

/*
    多线程
 */
public class demo3{
    public static void main(String[] args) {

        MyThread mt1 = new MyThread();
        MyThread mt2= new MyThread();
        MyThread mt3 = new MyThread();

        Thread t1 = new Thread(mt1,"线程1");
        Thread t2 = new Thread(mt2,"线程2");
        Thread t3 = new Thread(mt3,"线程3");

        t1.start();
        t2.start();
        t3.start();

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取正在执行的线程
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}


