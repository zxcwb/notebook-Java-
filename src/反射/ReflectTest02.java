package 反射;

import 常用类.String类与StringBuffer.User;

/*
获取到Class,能做什么
通过Class的newInstance()方法来实例化对象
注意：newInstance()方法内部实际上调用了无参数构造方法，必须保证无参构造存在才可以
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        //这里不使用反射机制
        User user = new User();
        System.out.println(user);

        //下面我们使用以反射机制的方式创建对象
        try {
            //通过反射机制，获取Class，通过Class来实例化对象
            Class c = Class.forName("常用类.String类与StringBuffer.User");

            // newInstance() 这个方法会调用User这个类的无参数构造方法，完成对象的创建。
            // 重点是：newInstance()调用的是无参构造，必须保证无参构造是存在的！
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
