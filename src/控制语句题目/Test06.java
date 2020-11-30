package 控制语句题目;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        /*
        一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
        找出1000内所有的完数。
          for (int i = 2;i<=1000;i++){
            int num =0;
            for (int j = 1;j<=i/2;j++){
                if (i%j==0){
                    num=num+j;
                }

            }
            if (i == num){
                System.out.println(i);
            }
        }
         */


/*
给一个不多于5位的正整数，
要求：
一、求它是几位数
二、逆序打印出各位数字
54321
 */
        Scanner s = new Scanner(System.in);
        System.out.println("输入一个不多于五位数的整数！");
        int num = s.nextInt();
        if (num/10>=1000){
            System.out.println("五位数");
            int geweishu = num%10;
            int shiweishu = num/10%10;
            int baiweishu = num/100%10;
            int qinaweishu = num/1000%10;
            int waiweishu = num/10000%10;
            System.out.println(geweishu+""+shiweishu+baiweishu+qinaweishu+waiweishu);
        }else if (num/10>=100){
            System.out.println("四位数");
            int geweishu = num%10;
            int shiweishu = num/10%10;
            int baiweishu = num/100%10;
            int qinaweishu = num/1000%10;
            System.out.println(geweishu+""+shiweishu+baiweishu+qinaweishu);
        }else if (num/10>=10){
            int geweishu = num%10;
            int shiweishu = num/10%10;
            int baiweishu = num/100%10;
            System.out.println(geweishu+""+shiweishu+baiweishu);
            System.out.println("三位数");
        }else if (num/10>=1){
            System.out.println("二位数");
            int geweishu = num%10;
            int shiweishu = num/10%10;
            System.out.println(geweishu+""+shiweishu);
        }else {
            int geweishu = num%10;
            System.out.println("个位数");
            System.out.println(geweishu);
        }
    }
}
