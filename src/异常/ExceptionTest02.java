package 异常;
/*
final finally finalize有什么区别
 final关键字
  final修饰的类无法继承
  final修饰的方法无法覆盖
  final修饰的变量不能重新赋值

  finally关键字
   和try一起联合使用
   finally语句块中的代码是必须执行的。

   finalize标识符
   是一个Object类方法
   这个方法是由垃圾回收器GC负责调用
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //final是一个关键字。表示最终的。不变的
        final int i = 100;
        //i=200;

        //finally是一个关键字，和try联用
        //在finally语句块中的代码是一定会执行
        try {

        }finally {
            System.out.println("周芮SB");
        }
        // finalize()是Object类中的一个方法。作为方法名出现。
        // 所以finalize是标识符。
        // finalize()方法是JVM的GC垃圾回收器负责调用。
        Object obj;
    }
}
