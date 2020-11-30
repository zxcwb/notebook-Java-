package Method.Day16.two;

import java.util.Scanner;

/*
猜数字游戏
一个类A有一个实例变量v，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
	如果大了则提示大了
	小了则提示小了
	等于则提示猜测成功
 */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int var = s.nextInt();
        A v = new A(var);
        B b = new B();
        b.guestvar(5,v.v);
    }
}
class A{
    int v;
    public A(int v) {
        this.v = v;
    }
}
class B {

    public void guestvar(int guest,int v){
   if (guest == v){
       System.out.println("猜测成功");
   }else if (guest>v){
       System.out.println("小了");
   }else {
       System.out.println("大了");
   }
    }
}