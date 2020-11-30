package Array;

import java.util.Scanner;

public class Array03 {
    //其实main方法上面传入的也是一个Stirng类型的数组
    //JVM调用main方法的时候，会自动传入一个String数组
    public static void main(String[] args) {
        //System.out.println(args.length);
        //得到的值为0,说明args的默认长度为零。
        //main方法接收的数组主要是用来接收用户输入的。

        //失败案例
        /*
         Scanner root = new Scanner(System.in);
        root.next();
        for (String str :args){
            System.out.println("我输出了"+str);
        }
         */

    }
}
