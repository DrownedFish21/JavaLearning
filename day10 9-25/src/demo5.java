public class demo5 {
    public static void main(String[] args) {
        R r = new R();
        Thread thread1 = new Thread(r);
        thread1.start();
        for (int i = 1; i < 101; i++) {
            if(i%2!=0)
            {
                System.out.println("主线程"+i);
            }
        }


    }

}
class I implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if(i%2!=0)
            {
                System.out.println("主线程"+i);
            }
        }
    }
}
class R implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i%2==0) {
                System.out.println("子线程" + i);
            }
        }
    }
}

