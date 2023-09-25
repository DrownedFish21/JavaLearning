/*
    使用同步代码解决线程安全问题
     synchronized (类类型的引用){

     }
     类类型的引用：要锁定的对象
 */
public class demo8 {
    public static void main(String[] args) {
        O o = new O();
        Thread t1 = new Thread(o, "窗口1");
        Thread t2 = new Thread(o, "窗口2");
        Thread t3 = new Thread(o, "窗口3");
        Thread t4 = new Thread(o, "窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class O implements Runnable {
    Integer ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票。");
                    ticket--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    break;
                }
            }
        }

    }

}