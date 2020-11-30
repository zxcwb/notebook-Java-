package IO.字符流.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
字符输入流只能读取普通文本，读取文本的时候比较快捷
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            //创建字符输入流
            reader = new FileReader("C:\\Users\\jay zhou\\Desktop\\io.txt");
            //准备一个char数组
            char[] chars = new char[4];
            //往char数组中读
            reader.read(chars);//一个字符一个字符地读
            for (char s:chars){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
