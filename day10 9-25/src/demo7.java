public class demo7 {
    public static void main(String[] args) {
        M a = new M();
        Thread t = new Thread(a,"子");
        //守护线程。主线程结束，守护线程也会结束
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("主" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class M implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
