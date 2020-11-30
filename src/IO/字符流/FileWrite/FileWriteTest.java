package IO.字符流.FileWrite;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWrite:
字符输出流。写
只能输出普通文本
 */
public class FileWriteTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            //在后面加上true表示追加
            out = new FileWriter("C:\\Users\\jay zhou\\Desktop\\io.txt",true);
            char[]  chars ={'1','2','3'};
            out.write(chars);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
