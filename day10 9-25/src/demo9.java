public class demo9 {
    public static void main(String[] args) {
        CC c = new CC();
        Thread t1 = new Thread(c, "窗1");
        Thread t2 = new Thread(c, "窗2");
        Thread t3 = new Thread(c, "窗3");
        Thread t4 = new Thread(c, "窗4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class CC implements Runnable{
    Integer ticket = 100;
    @Override
    public void run() {
        while (true){
            if(!Cell()){
                break;
            }
        }
    }
    public synchronized boolean Cell(){
        if(ticket<=0){
            return false;
        }
        else {
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票。");
            ticket--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
    }
}

