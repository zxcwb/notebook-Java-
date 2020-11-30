package 异常;
//自定义异常
/*
如何自定义异常
两步：
   第一步：编写一个类继承Exception或者RuntimeException
   第二步：提供两个构造方法，一个有参的一个无参的
 */
public class MyException extends Exception{
   public  MyException(){

   }
   public MyException(String s){
       super(s);
   }
}
