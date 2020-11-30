package IO.File类;

import java.io.File;

/*
1、File类和四大家族没得关系，不能完成文件的读和写
2、File对象代表什么
文件和目录路径名的抽象表示形式
一个File对象有可能对应的是目录，也可能是文件
File只是一个路径名的抽象表示形式
3、掌握File常用的方法
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception{
        //创建一个File对象
        File f = new File("C:\\Users\\jay zhou\\Desktop\\Java练习代码\\进阶\\代码\\chapter23\\src\\com\\bjpowernode\\java\\z");

        //判断是否存在bean这个文件
        System.out.println(f.exists());//存在返回true，不存在返回false

        //如果文件文件是否存在,如果不存在那么以文件的形式
        /*
        if (!f.exists()){
            f.createNewFile();
        }
        */
        /*
        if (!f.exists()){
            //以目录的形式新建
            f.mkdir();
        }
         */

        //也可以创建多重目录,注意这里是mkdirs
        File f2= new File("C:\\Users\\jay zhou\\Desktop\\a\\b");
        if(!f2.exists()){
          f2.mkdirs();
       }

        //还可以获取文件的父路径
        String parentPath  = f2.getParent();
        System.out.println(parentPath);
        //获取绝对路径
        parentPath = f2.getAbsolutePath();
        System.out.println(parentPath);
    }
}
