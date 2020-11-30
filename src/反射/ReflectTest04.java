package 反射;
/*
研究一下：Class.forName()发生了什么？
重点：
如果只希望一个类的静态代码执行，其他代码一律不执行
你可以使用：
Class.forName("完整类名");
这个方法的执行会导致类加载，类加载时，静态代码块执行
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        //这个方法导致：类加载
        try {
            Class.forName("反射.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
