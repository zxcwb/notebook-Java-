package 集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection中可以存什么元素
使用"泛型"之前，Collection中可以储存Object的所有子类型
使用了泛型之后，Collection只能储存某个具体的类型
Collection什么都能存，只要是Object的子类型就行。
（集合中不能直接储存基本数据类型，也不能存Java对象。只是存储Java对象的内存地址）

   2、Collection中的常用方法
        boolean add(Object e) 向集合中添加元素
        int size()  获取集合中元素的个数
        void clear() 清空集合
        boolean contains(Object o) 判断当前集合中是否包含元素o，包含返回true，不包含返回false
        boolean remove(Object o) 删除集合中的某个元素。
        boolean isEmpty()  判断该集合中元素的个数是否为0
        Object[] toArray()  调用这个方法可以把集合转换成数组。【作为了解，使用不多。】


 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //接口是无法被实例化的
        //Collection c = new Collection();
        //多态
        Collection c = new ArrayList();
        //Collection接口常用方法
        //自动装箱
        c.add(100);
        c.add(2);
        c.add(true);

        //获取集合元素中的个数size()
        System.out.println("集合中元素个数："+c.size());//3

        //清空集合clear()
        c.clear();
        System.out.println(c.size());//0

        //再向集合添加元素
        c.add("hello");
        c.add("爸爸");
        c.add(1);

        //判断集合是否包含某个元素contains(),返回Boolean值
        System.out.println(c.contains("绿巨人"));//false
        System.out.println(c.contains("爸爸"));//true
        System.out.println("集合中元素个数："+c.size());

        //删除集合中某个元素remove()
        c.remove(1);
        System.out.println(c.contains(1));//false

        //判断集合是否为空isEmpty()
        c.clear();
        System.out.println(c.isEmpty());//true

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("helloworld!");
        c.add(new Student());

        //转换成数组(toArray())(了解一下，不经常使用)
        Object[] obj = c.toArray();
        for (Object objs:obj
             ) {
            System.out.println(objs);
        }

    }
}
class Student{}