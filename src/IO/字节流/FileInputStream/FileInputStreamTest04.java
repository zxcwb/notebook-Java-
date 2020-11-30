package IO.字节流.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jay zhou\\Desktop\\io.txt");
            //准备一个byte数组
            byte[] bytes = new byte[4];
            System.out.println(fis.read(bytes));
            //读了四个
            /*
             while (true){
                int read = fis.read(bytes);
                if (read == -1){
                    break;
                }
               //把byte数组转换成字符串，读到多少个就转换多少个
                System.out.println(new String(bytes,0,read));
            }
             */
            //最终版
         int read = 0;
         //这里是根据是否读到直接来进行读取，如果不等于-1那么就说明还有字节
         while ((read = fis.read(bytes))!=-1){
             //有多少读多少
             System.out.println(new String(bytes,0,read));
         }
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
