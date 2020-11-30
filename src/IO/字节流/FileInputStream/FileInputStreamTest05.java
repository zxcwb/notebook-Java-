package IO.字节流.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其他常用方法
    int available():返回流当中剩余的没有读到的字节数量
    long skip(long n):跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jay zhou\\Desktop\\io.txt");
            System.out.println("总字节数量:"+fis.available());//7
            int read = fis.read();//读一个字节
            System.out.println("剩余字节数："+fis.available());//6
            byte[] bytes =  new byte[fis.available()];
            //read = fis.read(bytes);
            //System.out.println(new String(bytes));//bcdefg

            //skip跳过几个字节不读取，这个方法也可能以后会用
            fis.skip(5);
            System.out.println(fis.read());//103
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
