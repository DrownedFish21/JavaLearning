/*
    线程优先级数值10是最高优先级，0是最低优先级。
    优先级高并不代表一定先执行
 */
public class demo6 {
    public static void main(String[] args) {
        T t = new T();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3= new Thread(t);
        //线程优先级默认是5,取值范围[1,10]
        t1.setPriority(1);
        t3.setPriority(10);
        System.out.println("t1优先级" + t1.getPriority());
        t1.start();
        t2.start();
        t3.start();

    }
}
class T implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}
