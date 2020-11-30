package 多线程;
/*
1、获取当前线程对象
Thread t = Thread.currentThread();
返回值t就是当前线程

2、获取线程对象名字
String name = 线程对象.getName();

3、修改线程对象名字
线程对象.setName("线程名字");

4、当线程没有设置名字的时候，默认的名字的规律
Thread-0
Thread-1
Thread-2
Thread-3
.....
 */
public class ThreadTest05 {
    public void doSome(){
        //this.getName();
        //super.getName();这样不行
        String name = Thread.currentThread().getName();
        System.out.println("--->"+name);
    }
    public static void main(String[] args) {
        ThreadTest05 tt = new ThreadTest05();
        tt.doSome();

        //currentThread就是当前线程对象
        //这个代码出现在main方法当中，所以当前线程就是主线程
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());//main

        //创建线程对象
        MyThread2 t = new MyThread2();
        //设置线程的名字
        t.setName("t1");
        //获取线程名字
        String t1name  = t.getName();
        System.out.println(t1name);//Thread-0

        MyThread2 t2 = new MyThread2();
        t2.setName("t2");
        System.out.println(t2.getName());//Thread-1
        t2.start();

        //启动线程
        t.start();

    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            // currentThread就是当前线程对象。当前线程是谁呢？
            // 当t1线程执行run方法，那么这个当前线程就是t1
            // 当t2线程执行run方法，那么这个当前线程就是t2
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName()+"-->"+i);

           // System.out.println(super.getName()+"--->"+i);
          //  System.out.println(this.getName()+"--->"+i);
        }
    }
}