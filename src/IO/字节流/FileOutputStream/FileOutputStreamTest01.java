package IO.字节流.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//文件输出流
//负责从内存写到到硬盘
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //这种方式会将原文件清空
            //fos = new FileOutputStream("C:\\Users\\jay zhou\\Desktop\\io.txt");
            fos = new FileOutputStream("C:\\Users\\jay zhou\\Desktop\\io.txt",true);
            //开始写
            byte[] bytes ={97,98,99,100,101};
            //将byte数组全部写出
            fos.write(bytes);//abcde
            //将byte数组的一部分写出
            fos.write(bytes,0,5);//再写出abcde

            //字符串
            String s = "我是谁";
            //将字符串转换成byte数组
            // 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
            byte[] bs = s.getBytes();
            fos.write(bs);
            //写完要刷新，只有输出流需要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
