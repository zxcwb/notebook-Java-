package 多线程;
//守护线程
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BakDataThreadd();
        t.setName("备份数据的线程");

        //启动线程之前，将线程设置为守护线程
        t.setDaemon(true);

        t.start();

        //主线程是用户线程
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakDataThreadd extends  Thread{
    @Override
    public void run() {
        //即使是死循环，但由于该线程是守护者，当用户线程结束，守护线程自动终止
        while (true){
            int i = 0;
            System.out.println(Thread.currentThread().getName()+"-->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}