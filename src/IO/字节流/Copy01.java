package IO.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//使用FileInputStream和FileOutStream完成文件的拷贝
//一边读一边写
//使用字节流拷贝文件的时候，文件类型随意的、万能的，什么样的文件都能拷贝
public class Copy01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream  fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\jay zhou\\Desktop\\Java练习代码\\367-JavaSE进阶-通过反射获取注解对象属性的值.avi");
            fos = new FileOutputStream("C:\\Users\\jay zhou\\Desktop\\io\\拷贝视频.avi");

            //一边读一边写
            byte[] bytes = new byte[1024*1024];//1MB,一次最多拷贝1MB
            int readCount = 0;
            while ((readCount = fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }

            //刷新，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
