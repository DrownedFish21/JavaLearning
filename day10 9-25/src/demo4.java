public class demo4 {
    public static void main(String[] args) {
        Thread t1 = test("线程1");
        Thread t2 = test("线程2");
        Thread t3 = test("线程3");
        t1.start();
        t2.start();
        t3.start();
    }
    static Thread test(String name){
        MyRunnable mr = new MyRunnable();
        return new Thread(mr,name);
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ " " + i);
        }
    }
}
