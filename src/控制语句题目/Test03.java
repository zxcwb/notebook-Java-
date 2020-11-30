package 控制语句题目;

import java.util.Scanner;

/*
从控制台接收一个正整数，判断该数字是否为质数
质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = s.nextInt();
        if (num<=0){
            System.out.println(num+"不是质数");
        }else {
            if (num==2){
                System.out.println(num+"是质数");
            }else {
                boolean flag = true;
                if (num%2==0){
                    System.out.println(num+"不是质数");
                }else {
                      for (int i =2;i<=Math.sqrt(num);i++){
                         if (num%i==0){
                           flag=false;
                          }
                      }
                      if (flag){
                          System.out.println(num+"是质数");
                      }else {
                          System.out.println(num+"不是质数");
                      }
                }
            }
        }
    }
}
