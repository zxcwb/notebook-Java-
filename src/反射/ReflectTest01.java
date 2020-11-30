package 反射;

import java.util.Date;

/*
要操作一个类的字节码，需要首先获取到这个类的字节码，怎么获取java.lang.class实例？
三种方式：
1、Class c = Class.forName("完整类名带包名");
2、Class c = 对象.getClass();
3、Class c = 任何类型.class;
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
         Class.forName()
         1、静态方法
         2、方法的参数是一个字符串
         3、字符串需要的是一个完整类名
         4、完整类名必须带有包名。java.lang包也不能省略
         */
        Class c1 = null;
        Class c2 = null;
        try {
            c1  = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer"); // c3代表Integer类型
            Class c4 = Class.forName("java.lang.System"); // c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //java中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x= s.getClass();// x代表String.class字节码文件，x代表String类型。
        System.out.println(c1 == x);// true（==判断的是对象的内存地址。）

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y); // true (c2和y两个变量中保存的内存地址都是一样的，都指向方法区中的字节码文件。)

        // 第三种方式，java语言中任何一种类型，包括基本数据类型，它都有.class属性。
        Class z = String.class; // z代表String类型
        Class k = Date.class; // k代表Date类型
        Class f = int.class; // f代表int类型
        Class e = double.class; // e代表double类型

        System.out.println(x == z); // true
    }
}
