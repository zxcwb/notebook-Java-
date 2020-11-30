package IO.记录日志工具;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

//日志工具
public class Logger {
    //记录日志的方法
    //再次提醒，输出（写）有关的流如果后面补交true，它会清空了再写数据
    public static  void log(String msg) {
        try {
            PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\jay zhou\\Desktop\\logger.txt"));
            //改变输出方向,改到字节输出流（写）的路径文件下
            System.setOut(out);
            //当前日期时间
            //日期对象
            Date nowTime = new Date();
            //从新定义日期显示格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);
            System.out.println(strTime+"--->"+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
