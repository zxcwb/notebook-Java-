package IO.字节流.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        //采用byte数组一次读取多个字节
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jay zhou\\Desktop\\io.txt");
            byte[] bytes = new byte[4];
            //读入缓冲区的字节总数，如果因为已经到达文件末尾而没有更多的数据，则返回 -1。
            int read = fis.read(bytes);
            System.out.println(read);//一次读到4个字节

            read = fis.read(bytes);
            System.out.println(read);//第二次只能读到3个字节

            //将字节数组全部转换为字符串
            System.out.println(new String(bytes));

            //不应该全部转换，应该是读取多少节，转换多少节
            System.out.println(new String(bytes,0,read));

            read = fis.read(bytes);
            System.out.println(read);//一个直接没读取到，返回-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
