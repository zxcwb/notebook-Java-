package 多线程;
//实现线程的第二种方式，编写一个类实现Java.lang.Runnable
public class ThreadTest03 {
    public static void main(String[] args) {
        /*
        //创建一个可运行的对象
        MyRunable r = new MyRunable();
        //将可运行的对象封装成一个线程对象
        Thread t = new Thread(r);
         */
        Thread t = new Thread(new MyRunable());//合并代码
        //启动线程
        t.start();
        for (int i = 0;i<100;i++){
            System.out.println("主线程--->"+i);
        }
    }
}
class  MyRunable implements  Runnable{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println("分支栈--->"+i);
        }
    }
}