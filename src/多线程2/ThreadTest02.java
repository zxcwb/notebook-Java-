package 多线程2;
/*
线程的优先级
线程不能主动的获取CPU的时间片段，它是被动等待线程调度器去分配
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main);
        f();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                System.out.println(t);
            }
        });
        t.start();
        //获得线程名
        System.out.println(t.getName());
        //获得线程的唯一标识
        System.out.println(t.getId());
        //获取优先级1-10   默认为5
        System.out.println(t.getPriority());
        //判断线程是否还在活动状态
        System.out.println(t.isAlive());
        //判断线程是否被中断
        System.out.println(t.isInterrupted());
        //判断线程是不是守护线程
        System.out.println(t.isDaemon());
    }
    private static void f(){
        Thread f = Thread.currentThread();
        System.out.println(f);
    }
}
