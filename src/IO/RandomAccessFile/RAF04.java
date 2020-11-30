package IO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RAF04 {
    public static void main(String[] args) throws IOException {
     /* RandomAccessFile randomAccessFile = new RandomAccessFile("D:/IO/a.txt","rw");
        Scanner scanner = new Scanner(System.in);
        String in;
        randomAccessFile.seek(14);
        while (true){
            in = scanner.nextLine();
            if ("exit".equals(in)){
                break;
            }
            byte[] data = in.getBytes("UTF-8");
            randomAccessFile.write(data);
        }
        randomAccessFile.close();
        scanner.close();
        System.out.println("数据写出完毕");*/

        RandomAccessFile randomAccessFile = new RandomAccessFile("D:/IO/a.txt","rw");
        byte[] data = new byte[(int)randomAccessFile.length()];
        randomAccessFile.read(data);
        String s = new String(data,"UTF-8");
        System.out.println(s);
        randomAccessFile.close();
    }
}
