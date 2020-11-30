package IO.缓冲和转换流.BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//转换流:InputStreamReader
public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception {
        //字节流
        FileInputStream in = new FileInputStream("C:\\Users\\jay zhou\\Desktop\\io.txt");

        //BufferedReader br = new BufferedReader(in);
        //这个构造方法只能传一个字符流，不能传字节流

        //通过转换流转换（把字节流转换为字符流）
        //in是节点流,reader是包装流
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        //可以直接合并着写
        BufferedReader brs = new BufferedReader(new InputStreamReader(in));

        String line = null;
        while ((line = brs.readLine())!=null){
            System.out.println(line);
        }
    }
}
