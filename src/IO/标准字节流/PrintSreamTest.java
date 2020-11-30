package IO.标准字节流;

import java.io.FileOutputStream;
import java.io.PrintStream;

//标准的字节输出流。默认输出到控制台
public class PrintSreamTest {
    public static void main(String[] args) throws Exception{
         //联合起来写
        System.out.println("hello world!");

        //分开写
        PrintStream ps = System.out;
        ps.println("hello sb!");
        ps.println("hello zhangsan!");

        //标准输出流不需要手动close()关闭
        //可以改变标准输出方向
        /*
        System.gc();
        调用垃圾回收器
        System.currentTimeMillis();
        1970年到现在系统时间毫秒数
        PrintStream ps2 = System.out;
        System.exit(0);
        终止当前运行的java虚拟机
        //
        System.arraycopy(....);
        数组拷贝
         */

        //标准输出流可以改变
        PrintStream pss = new PrintStream(new FileOutputStream("C:\\Users\\jay zhou\\Desktop\\log.txt"));
        //修改输出方向
        System.setOut(pss);
        //再输出
        System.out.println("hello world");

    }
}
