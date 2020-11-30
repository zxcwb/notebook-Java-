package IO.数据流;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
DataInputStream:数据直接输入流
DataOutputStream写的文件只能够写DataInputStream读入的数据，并且读的时候需要和写的顺序一致才能正常取出数据
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\jay zhou\\Desktop\\io.txt"));
        //开始读
        byte c1 = dis.readByte();
        byte c2 = dis.readByte();
        byte c3 = dis.readByte();
        byte c4 = dis.readByte();
        byte c5 = dis.readByte();
        byte c6 = dis.readByte();
        //必须得全读入内存，不然会抛出异常
        System.out.println(c1);
    }
}
