package 多线程2;

public class ThreadTest01 {
    public static void main(String[] args) {
         MyRunnable1 myRunnable1 = new MyRunnable1();
         MyRunnable2 myRunnable2 = new MyRunnable2();
         Thread thread = new Thread(myRunnable1);
         Thread thread1 = new Thread(myRunnable2);
         thread.start();
         thread1.start();
         //匿名内部类
         new Thread(new Runnable() {
             @Override
             public void run() {
                 for (int i = 0;i<1000;i++){
                     System.out.println("朱军坤");
                 }
             }
         }).start();
         //lambda表达式
         Thread thread2 = new Thread(()-> System.out.println("hello"));
    }
}
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
       for (int i = 0;i<1000;i++){
           System.out.println("周绪驰");
       }
    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<1000;i++){
            System.out.println("高康凯");
        }
    }
}