package 接口和抽象类.接口基础语法;
/*
接口和接口之间叫继承(extends)，类和接口之间叫实现(implements)
重点：
当一个类实现接口，必须将接口里的方法全部重写。
其实接口也是一个特殊的类
 */
public class Test02 {
}
interface AB{
     void m1();
     void m2();
}
class abc implements AB{
    @Override
    public void m1() {
        System.out.println("m1被重写了");
    }
    public void m2(){
        System.out.println("m2被重写了");
    }
}