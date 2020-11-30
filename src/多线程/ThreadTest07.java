package 多线程;
//关于Thread.sleep()方法的一个面试题
public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        //调用start方法
        try {
            //问题是：这行代码会让线程t进入休眠状态吗？
            t.sleep(1000*5);
            //这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠
            //这行代码出现在main方法中，main线程睡眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒后这里代码执行
        System.out.println("hello world!");
    }
}
class  MyThread3 extends Thread{
    @Override
    public void run() {
     for (int i = 0;i<10000;i++){
         System.out.println(Thread.currentThread().getName()+"--->"+i);
     }
    }
}