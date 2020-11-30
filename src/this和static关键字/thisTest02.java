package this和static关键字;
//变量在main方法能否被访问?
public class thisTest02 {
    //实例变量
    int i = 100;
    //静态变量
    static int k = 111;
    public static void main(String[] args) {
        // 错误: 无法从静态上下文中引用非静态 变量 i
        //System.out.println(i);

        //变量i通过new对象来获取
        thisTest02 t = new thisTest02();
        System.out.println(t.i);

        //静态变量用“类名.”访问
        System.out.println(thisTest02.k);

        //类名.能省略么？
        System.out.println(k);
        //可以。

        //System.out.println(k2);这样是错误的
        System.out.println(Teacher.k2);
        //这里说明，不在同类中访问静态变量，需要在前面加上“类名.”
    }
}
class Teacher{
  static int k2 = 0;
}