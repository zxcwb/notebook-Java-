package 多线程;
/*
sleep睡眠太久了，如果希望半道上醒来，也就是叫醒一个正在睡眠的线程
注意：
这里不是中断线程的执行，是终止线程的睡眠
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunable2());
        t.setName("t");
        t.start();

        //希望5秒之后，t线程醒来（5秒之后主线程手里的活儿干完了）
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断t线程的睡眠（这种中断睡眠的方法依靠了Java的异常异常处理机制）
        t.interrupt();//干扰，一盆冷水过去，叫醒了正在睡觉的线程
    }
}
class  MyRunable2 implements Runnable{
    //重点:run方法中的异常不能throws，只能try...catch
    //因为run方法当中父类没有抛出任何异常，子类不能比父类抛出更多的异常
    @Override
    public void run() {
       //睡眠一年
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //一年之后才会执行到这里
        System.out.println(Thread.currentThread().getName()+"--->end");

        //doOther();
    }
    //其他方法可以throws
    public void doOther() throws  Exception{

    }
}