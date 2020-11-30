package IO.字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer  = null;
        try {
            writer = new FileWriter("C:\\Users\\jay zhou\\Desktop\\ios.txt");
            reader = new FileReader("C:\\Users\\jay zhou\\Desktop\\io.txt");
            char[] chars = new char[4];
            //边读边写
            reader.read(chars);
            int readCount = 0;
            while ((readCount=reader.read(chars))!=-1){
                writer.write(chars,0,readCount);
            }
            //刷新
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
