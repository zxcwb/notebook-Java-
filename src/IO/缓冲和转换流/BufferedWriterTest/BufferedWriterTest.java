package IO.缓冲和转换流.BufferedWriterTest;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

//BufferedWriter:带有缓冲的字符输出流
//OutputStreamWrite：输出转换流（写转换）
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        //带有缓冲区的字符输出流，千万记得，要是输出流后面不加上true，那么原文件会被清空
        /*
        file - 为了进行写入而打开的文件。
        append - 如果为 true，则将字节写入文件末尾处，而不是写入文件开始处
         */
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\jay zhou\\Desktop\\ioo.txt",true)));
        //开始写
        out.write("我是你爸爸");
        out.write("\n");
        out.write("你知道吗？");
        //刷新
        out.flush();
        //关闭最外层
        out.close();
    }
}
