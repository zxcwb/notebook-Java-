package 多线程;
//怎么合理的终止一个线程的执行。这种方式是很常用的
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunable4 r = new MyRunable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        //模拟五秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
    }
}
class  MyRunable4 implements  Runnable{
   //打一个boolean标记
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
          if (run){
              System.out.println(Thread.currentThread().getName()+"--->"+i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {

              }
          }else {
              //return 就结束了，在结束之前还有什么没保存的。
              //在这里可以保存
              //终止当前线程
              return;
          }
        }
    }
}