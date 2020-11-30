package IO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF03 {
    public static void main(String[] args) throws IOException {
       /* RandomAccessFile randomAccessFile  = new RandomAccessFile("D:\\IO\\a.txt","rw");

        randomAccessFile.write(98);
        System.out.println("输出完毕");
        randomAccessFile.seek(0);
        int d = randomAccessFile.read();
        System.out.println(d);

        RandomAccessFile randomAccessFile1 = new RandomAccessFile("D:\\IO\\b.txt","rw");

        int d;
        while ((d = randomAccessFile.read()) != -1){
            randomAccessFile1.write(d);
        }
        System.out.println("复制完毕");*/

       RandomAccessFile randomAccessFile = new RandomAccessFile("D:/IO/042_CRM项目-多表联查2.avi","rw");
       RandomAccessFile randomAccessFile1 = new RandomAccessFile("D:/IO/042_CRM项目-多表联查1.avi","rw");
       int len;
       byte[] data = new byte[102400];
       while ((len=randomAccessFile.read(data)) != -1){
           randomAccessFile1.write(data,0,len);
       }
        System.out.println("复制完毕");
    }
}
