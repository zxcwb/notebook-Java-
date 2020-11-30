package IO.数据流;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
/*
数据专属的流
这个流可以将数据连同数据类型一并写入文件
注意：这个不是普通文本文档，（这个文件记事本打不开）
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception{
      //创建数据专属字节输出流
        DataOutputStream dos = new java.io.DataOutputStream(new FileOutputStream("C:\\Users\\jay zhou\\Desktop\\ioos"));
      //写数据
        byte b = 100;
        short a = 20;
        long l = 23L;
        double i = 1.24;
        char h = 'c';
        boolean o = true;
        //写入硬盘
        dos.writeByte(b);
        dos.writeShort(a);
        dos.writeLong(l);
        dos.writeDouble(i);
        dos.writeChar(h);
        dos.writeBoolean(o);
        //刷新
        dos.flush();
        //关闭最外层
        dos.close();
    }
}
