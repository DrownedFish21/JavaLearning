import java.util.concurrent.locks.ReentrantLock;
/*
   锁lock
*/
public class demo10 {
    public static void main(String[] args) {
        OP op = new OP();
        Thread t1 = new Thread(op, "站1");
        Thread t2 = new Thread(op, "站2");
        Thread t3 = new Thread(op, "站3");
        Thread t4 = new Thread(op, "站4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        int 年份 = 2019;
        System.out.println(年份);
    }
}
class OP implements Runnable{
    int tic = 100;
    ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            reentrantLock.lock();
            if(tic>0) {
                System.out.println(Thread.currentThread().getName() + "正在卖第" + tic + "个票。");
                tic--;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    reentrantLock.unlock();
                }
            }
            else {
                reentrantLock.unlock();
                break;
            }
        }

    }
}
