package 控制语句题目;

import java.util.Scanner;

/*
5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
例如：输入5，则打印如上图5行。
Scanner s = new Scanner(System.in);
        System.out.println("请输入一个值");
        int rows = s.nextInt();
        for (int i = 1;i<=rows;i++){
           for (int j =0;j<rows-i;j++){
               System.out.print(" ");
           }
           for (int k =0;k<i*2-1;k++){
               System.out.print("*");
           }
            System.out.println();
        }
6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
  Double money  = 0.0;
        int day = 0;
        while (money<100){
            day++;
            money+=2.5;
            if (day%5==0){
                money-=6.0;
            }
            if (money>=100){
                break;
            }
        }
        System.out.println("小芳用了"+day+"存了"+money+"元钱");
 */
public class Test05 {
    public static void main(String[] args) {
      /*
      从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *       1     4
   ***      3     3
  *****     5     2
 *******    7     1
*********   9     0
例如：输入5，则打印如上图5行。
   Scanner s = new Scanner(System.in);
        System.out.println("请输入数字");
        int rows = s.nextInt();
        for (int i  = 1;i<=rows;i++){
            for (int j  = 0;j<rows-i;j++){
                System.out.print(" ");
            }
            for (int k =0;k<i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
       */

      /*
      小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
       */
       Double money = 0.0;
      int day = 0;
      while (money<100){
          day++;
          money+=2.5;
          if (day%5==0){
              money-=6.0;
          }
          if (money>=100){
              break;
          }
      }
        System.out.println("小芳花了"+day+"天"+"攒了"+money+"元");
    }
}
