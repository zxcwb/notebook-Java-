package 控制语句题目;

import java.util.Scanner;

/*
1、计算1000以内所有不能被7整除的整数之和
 int num = 0;
        for (int i = 0;i<=1000;i++){
            if (i%7==0){
                continue;
            }
            num+=i;
        }
        System.out.println("整数为"+num);
2、计算 1+2-3+4-5+6-7....+100的结果
int num = 0;
       for (int i =2;i<=100;i++){
           if (i%2==0){
               num+=i;
           }else {
               num-=i;
           }
       }
        System.out.println(num);
3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
  Scanner s = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = s.nextInt();
        for (int i = num;i>1;i--) {
          num*=(i-1);
        }
        System.out.println(num);
4、从控制台接收一个正整数，判断该数字是否为质数
质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）

5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
例如：输入5，则打印如上图5行。

6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
找出1000内所有的完数。

8、给一个不多于5位的正整数，
要求：
一、求它是几位数
二、逆序打印出各位数字
 */
public class Test02 {
    public static void main(String[] args) {

        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("请输入一个数");
            int num = s.nextInt();
            if (num<=1){
                System.out.println("请输入合法数字");
            }else {
                if (num==2){
                    System.out.println(num+"是质数");
                    return;
                }
                if (num%2==0){
                    System.out.println(num+"不是质数");
                    return;
                }else{
                    boolean flag = true;
                    for (int i = 2;i<=Math.sqrt(num);i++){
                        if (num%i==0){
                            flag = false;
                        }
                    }
                    if(flag){
                        System.out.println(num+"是质数");
                        return;
                    }else {
                        System.out.println(num+"不是质数");
                        return;
                    }
                }
            }
        }
        
    }
}
