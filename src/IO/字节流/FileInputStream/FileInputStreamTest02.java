package IO.字节流.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
       //对上一个程序进行改进
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jay zhou\\Desktop\\io.txt");
   /*
  while (true){
                int read = fis.read();
                if (read == -1){
                    break;
                }
                System.out.println(read);
             }
    */

            //对上述循环进行改进

            int read = 0;
            while ((read = fis.read()) != -1){
                System.out.println(read);
            }
            //上述原理就是，如果读到的不为-1说明那里还有字节可以读，继续读文件


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException  e){
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
