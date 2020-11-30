package IO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RAF02 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("","rw");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String in = scanner.nextLine();
            if ("exit".equals(in)){
                break;
            }else {
                byte[] data = in.getBytes("UTF-8");
                randomAccessFile.write(data);
            }
        }
        System.out.println("写出完毕");
        randomAccessFile.close();
    }
}
