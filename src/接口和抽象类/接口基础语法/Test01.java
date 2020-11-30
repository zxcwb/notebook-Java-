package 接口和抽象类.接口基础语法;
/*
1、接口也是个“引用数据类型”
2、接口完全抽象（抽象类是半抽象的）
3、接口的语法是：
【修饰符列表】interface 接口名{}
4、支持多继承，一个接口可以多个接口
5、接口包含两部分，常量和抽象方法，没有其他花里胡哨的
6、接口中的元素都是public公开的
7、接口中不能有方法体，抽象方法定义和常量定义时，public abstract以及public static final都可以省略都可以
8、接口继承接口extends，类是实现implements
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println();
    }
}
interface  A{
}
interface  B extends A{}
interface  C extends A,B{}
class Animal implements C,B,A{}
class dog extends  Animal{}
//class bird extends Animal,dog{}类之间不支持多继承
interface  sum{
     int a=10;
     public static  final  int b = 20;
    // void sum(){}不能有方法体，因为这里自由是抽象方法
     void sum();
     public  abstract int sums();//抽象方法
}