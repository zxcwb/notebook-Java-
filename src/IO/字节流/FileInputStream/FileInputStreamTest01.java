package IO.字节流.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
//字节的方式，完成输入的操作，完成读的操作（硬盘-->内存）
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        try {
            fis = new FileInputStream("C:\\Users\\jay zhou\\Desktop\\io.txt");
            int read1 =   fis.read();
            System.out.println(read1);
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
    }
    }
