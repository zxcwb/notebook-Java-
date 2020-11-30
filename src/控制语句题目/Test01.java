package 控制语句题目;

import java.util.Scanner;

/*
1、根据指定月份，打印该月份所属的季节。
	3,4,5 春季
	6,7,8 夏季
	9,10,11 秋季
	12, 1, 2 冬季

	if和switch各写一版

2、从键盘接收一个数字，判断该数字的正负。

3、从键盘接收一个数字，判断该数字的奇偶。

4、整数大小比较：输入两个整数，比较大小，
	若x>y 输出 >
	若x=y 输出 =
	若x<y 输出 <

5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
使用if-else结构，并按从小到大的顺序输出

6、打车起步价8元（3KM以内）
超过3KM，超出的每公里1.2元
超过5KM，超出的每公里1.5元
请在键盘上接收公里数，得出总价。
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        1、根据指定月份，打印该月份所属的季节。
	3,4,5 春季
	6,7,8 夏季
	9,10,11 秋季
	12, 1, 2 冬季

	if和switch各写一版
         */
        //if语句
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("请输入季节");
        int month = s.nextInt();
        if (month<=0||month>12){
            System.out.println("请输入合法值");
            return;
        }
        if (month==3||month==4||month==5){
            System.out.println("春季");
        }else  if (month==6||month==7||month==8){
            System.out.println("夏季");
        }else  if (month==9||month==10||month==11){
            System.out.println("秋季");
        }else  if (month==12||month==1||month==2){
            System.out.println("冬季");
        }


         */

        /*
        //switch语句
        Scanner s = new Scanner(System.in);
        System.out.println("请输入季节");
        int month = s.nextInt();
        if (month<=0||month>12){
            System.out.println("请输入合法值！");
            return;
        }
        switch (month){
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("冬季");
                break;
        }

         */

     /*
     2、从键盘接收一个数字，判断该数字的正负。
Scanner s = new Scanner(System.in);
 System.out.println("请输入数字");
int num  = s.nextInt();
if (num>0){
    System.out.println("正");
}else if (num==0) {
    System.out.println("为0");
}else {
    System.out.println("负");
}

3、从键盘接收一个数字，判断该数字的奇偶。
 Scanner s = new Scanner(System.in);
 System.out.println("请输入数字");
        int num  = s.nextInt();
        if (num%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
4、整数大小比较：输入两个整数，比较大小，
	若x>y 输出 >
	若x=y 输出 =
	若x<y 输出 <
   Scanner s = new Scanner(System.in);
        System.out.println("请输入数字x");
        int num1  = s.nextInt();
        System.out.println("请输入数字y");
        int num2  = s.nextInt();

        if(num1>num2){
            System.out.println("x>y");
        }else if (num1<num2){
            System.out.println("x<y");
        }else {
            System.out.println("x=y");
        }

5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
使用if-else结构，并按从小到大的顺序输出
 Scanner s = new Scanner(System.in);
        System.out.println("请输入num1");
        int num1  = s.nextInt();
        System.out.println("请输入num2");
        int num2  = s.nextInt();
        System.out.println("请输入num3");
        int num3  = s.nextInt();

        if (num1>num2&&num2>num3&&num1>num3){
            System.out.println(num1+">"+num2+">"+num3);
        }else if (num1>num2&&num2<num3&&num1>num3){
            System.out.println(num1+">"+num3+">"+num2);
        }else if (num2>num1&&num2>num3&&num3<num2){
            System.out.println(num2+">"+num1+">"+num3);
        }else if (num2>num3&&num2>num1&&num1<num3){
            System.out.println(num2+">"+num3+">"+num2);
        }else  if (num3>num1&&num1>num2&&num3>num2){
            System.out.println(num3+">"+num1+">"+num2);
        }else {
            System.out.println(num3+">"+num2+">"+num1);
        }
6、打车起步价8元（3KM以内）
超过3KM，超出的每公里1.2元
超过5KM，超出的每公里1.5元
请在键盘上接收公里数，得出总价。
      */
        Scanner s = new Scanner(System.in);
        System.out.println("请输入公里数");
        Double num1  = s.nextDouble();
        if (num1<=3){
            System.out.println("路费:"+8+"元");
        }else if (num1>=3&&num1<=5){
            System.out.println("路费:"+(8+(num1-3)*1.2)+"元");
        }else {
            System.out.println("路费:"+8+2*1.2+(num1-5)*1.5+"元");
        }
    }
}
