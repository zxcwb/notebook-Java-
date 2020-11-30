package 模拟数据库;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择：1.注册用户，2.修改昵称，3.修改密码，4.登录用户");
        int i =  scanner.nextInt();
        switch (i){
            case 1:
                reg();
                break;
            case 2:
                reNick();
                break;
            case 3:
                rePWD();
                break;
            case 4:
                login();
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
    private static void reg() throws IOException {
        System.out.println("开始注册用户");
        RandomAccessFile raf = new RandomAccessFile("D:/user.dat", "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        int index;
        String username;
        boolean f = false;
        do {
            username = scanner.nextLine();
            index = checkUserName(username);
            if(index!=-1) {
                System.out.println("用户名已存在，请重新输入");
                f = true;
            }else {
                f = false;
            }
        }while(f);
        System.out.println("请输入密码");
        String pwd = scanner.nextLine();
        System.out.println("请输入昵称");
        String nickname = scanner.nextLine();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();

        raf.seek(raf.length());
        byte[] data = username.getBytes("UTF-8");
        data = Arrays.copyOf(data, 32);
        raf.write(data);

        data = pwd.getBytes("UTF-8");
        data = Arrays.copyOf(data, 32);
        raf.write(data);

        data = nickname.getBytes("UTF-8");
        data = Arrays.copyOf(data, 32);
        raf.write(data);

        raf.writeInt(age);
        raf.close();
        System.out.println("用户注册成功");
    }

    private static void reNick() throws IOException {
        System.out.println("开始修改昵称");
        RandomAccessFile raf = new RandomAccessFile("D:/user.dat", "rw");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        int index;
        String username;
        boolean f = false;
        do {
            username = scan.nextLine();
            index = checkUserName(username);
            if(index==-1) {
                System.out.println("用户名不存在，请重新输入");
                f = true;
            }else {
                f = false;
            }
        }while(f);

        System.out.println("请输入新昵称");
        String newnick = scan.nextLine();
        raf.seek(index*100+64);
        byte[] data = newnick.getBytes("UTF-8");
        data = Arrays.copyOf(data, 32);
        raf.write(data);
        raf.close();
        System.out.println("昵称修改成功");
    }

    private static void rePWD() throws IOException {
        System.out.println("开始修改密码");
        RandomAccessFile raf = new RandomAccessFile("D:/user.dat", "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始输入用户名");
        int index;
        String username;
        boolean f = false;
        do {
            username = scanner.nextLine();
            index = checkUserName(username);
            if (index == -1){
                System.out.println("用户不存在，请重新输入");
                f = true;
            }else {
                f = false;
            }
        }while (f);
        System.out.println("请输入旧密码");
        String oldpwd;
        int c = 0;
        for (int i = 0;i<3;i++){
            oldpwd = scanner.nextLine();
            if (checkPWD(index,oldpwd)){
                break;
            }else {
                c++;
                System.out.println("密码输入错误，还有"+(3-c)+"次机会");
            }
        }
        if (c == 3){
            System.out.println("三次机会用完");
            return;
        }
        System.out.println("请输入新密码");
        String newpwd = scanner.nextLine();
        raf.seek(index*100+32);
        raf.write(Arrays.copyOf(newpwd.getBytes("UTF-8"), 32));
        raf.close();
        System.out.println("修改密码成功");
    }

    private static void login() throws IOException {
        System.out.println("开始登陆用户");
        RandomAccessFile raf = new RandomAccessFile("D:/user.dat", "rw");
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始输入用户名");
        int index;
        String username;
        boolean f = false;
        do{
            username = scanner.nextLine();
            index = checkUserName(username);
            if (index == -1){
                System.out.println("用户名不存在");
                f = true;
            }else {
                f = false;
            }
        }while (f);
        System.out.println("请输入密码");
        String pwd;
        int c = 0;
        for (int i = 0;i<3;i++){
            pwd = scanner.nextLine();
            if (checkPWD(index,pwd)){
                break;
            }else {
                c++;
                System.out.println("密码输入错误，还有"+(3-c)+"次机会，请重新输入");
            }
        }
        if (c == 3){
            System.out.println("三次机会用完");
            return;
        }
        System.out.println("登陆成功");
        raf.seek(index*100);
        byte[] data = new byte[32];
        raf.read(data);
        String name = new String(data,"UTF-8").trim();
        raf.seek(index*100+64);
        data = new byte[32];
        raf.read(data);
        String nick = new String(data,"UTF-8").trim();
        System.out.println("欢迎你"+nick+"-用户名"+name);
        raf.close();
    }

    private static int checkUserName(String username) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("D:/user.dat", "rw");
        int index = -1;
        for (int i = 0;i<raf.length()/100;i++){
                   index = i;
                   raf.seek(i*100);
                   byte[] data = new byte[32];
                   raf.read(data);
                   String name = new String(data,"UTF-8").trim();
                   if (name.equals(username)){
                       return index;
                   }
        }
        return -1;
    }

    private static boolean checkPWD(int index,String pwd) throws IOException{
        RandomAccessFile raf = new RandomAccessFile("D:/user.dat", "rw");
        raf.seek(index*100+32);
        byte[] data = new byte[32];
        raf.read(data);
        String p = new String(data,"UTF-8").trim();
        if (p.equals(pwd)){
            return true;
        }
        return false;
    }
}
