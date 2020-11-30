package IO.缓冲和转换流.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception {

            FileReader reader = new FileReader("C:\\Users\\jay zhou\\Desktop\\io.txt");
            // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
            // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
            // 像当前这个程序来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流。
            BufferedReader br = new BufferedReader(reader);
            //返回该行内容的字符串
            String line = br.readLine();
            System.out.println(line);
            //如果没用读到，那么就会返回null
            String line2 = br.readLine();
            System.out.println(line2);
            br.close();

    }
}
