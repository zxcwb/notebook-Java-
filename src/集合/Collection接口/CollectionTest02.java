package 集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        //Collection集合的迭代/遍历，是所有Collection通用的一种方式
        //在map集合中不能用
        //创建集合对象
        Collection c= new ArrayList();//ArrayList集合有序可重复
        //添加元素
        c.add("abc");
        c.add("def");
        c.add(1010);
        c.add( new Object());

        //遍历/迭代集合

        //首先获取迭代器Iterator
        Iterator it = c.iterator();

        //开始遍历集合
        /*
        下面是迭代器对象中的方法
        boolean hasNext()如果仍有元素，返回true
        Object  next()返回迭代的下一个元素
         */
        while (it.hasNext()){
            Object obj = it.next();
            //不管存进去的是什么，取出来都是Object
            System.out.println(obj);
        }
    }
}
