package IO.File类;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//File类常用方法
public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\jay zhou\\Desktop\\a\\b");
        //获取文件名
        System.out.println("文件名:"+f1.getName());
        //判断是否是一个绝对路径
        System.out.println(f1.isAbsolute());
        //判断是否是一个目录
        System.out.println(f1.isDirectory());
        //判断是否是一个文件
        System.out.println(f1.isFile());

        //获取文件最后一次修改的时间
        long haomiao  = f1.lastModified();//从1970年到现在的毫秒数
        Date time  = new Date(haomiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss SSS");
        String strtime = sdf.format(time);
        System.out.println(strtime);

        //获取文件大小
        System.out.println(f1.length());

    }
}
