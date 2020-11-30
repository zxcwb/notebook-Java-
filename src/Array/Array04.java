package Array;

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner system = new Scanner(System.in);
        String[] arg = new String[2];
        System.out.println("请输入账号");
        arg[0]= system.next();
        System.out.println("请输入密码");
        arg[1]= system.next();
       if (arg.length == 2);
        {
            if ("123".equals(arg[0]) && "456".equals(arg[1])) {
                System.out.println("登陆成功！");
            }
            {
                return;
            }
        }
    }
}
