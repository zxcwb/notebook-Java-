package 多线程;
/*
实现线程的第一种方式：
编写一个类，直接继承java.lang.Thread ,重写run方法
直接new线程对象
启动线程：start()方法

注意：
方法体中的代码永远都是从上而下执行的

--以下程序一个主线程一个分支线程
说明有多个线程在运行
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //这里是main方法，这里的代码属于主线程，在主栈中运行
        //新建一个分支栈线程对象
        MyThread t = new MyThread();
        //启动线程
        //t.run();//不会启动线程，不会分配新的分支栈（这种方式是单线程）
        // start()方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码任务完成之后，瞬间就结束了。
        // 这段代码的任务只是为了开启一个新的栈空间，只要新的栈空间开出来，start()方法就结束了。线程就启动成功了。
        // 启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部（压栈）。
        // run方法在分支栈的栈底部，main方法在主栈的栈底部。run和main是平级的。
        t.start();
        //这里的代码还是运行在主线程中
        for (int i = 0;i<1000;i++){
            System.out.println("主线程--->"+i);
        }
    }
}
class  MyThread extends  Thread{
    @Override
    public void run() {
        //编写程序，这段程序运行在分支线程中（分支栈）
        for (int i  =0;i<1000;i++){
            System.out.println("分支线程--->"+i);
        }
    }
}