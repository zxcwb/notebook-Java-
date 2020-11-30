package IO.RandomAccessFile;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RAF05 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("D:/IO/a.txt","rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始注册");
        System.out.println("请输入用户名");
        String name = scanner.nextLine();
        System.out.println("请输入密码");
        String pwd = scanner.nextLine();
        System.out.println("请输入昵称");
        String nick = scanner.nextLine();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        randomAccessFile.seek(randomAccessFile.length());
    }
}
