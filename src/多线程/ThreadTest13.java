package 多线程;
//线程何并
public class ThreadTest13 {
    public static void main(String[] args) {
        System.out.println("main begin");

        Thread t = new Thread(new MyRunnable7());
        t.setName("t");
        t.start();

        //合并线程
        try {
            t.join();//t合并到当前线程中，当前线程受到堵塞，t线程执行直到结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i =0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println("main over");
    }
}
class  MyRunnable7 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0;i<10000;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}