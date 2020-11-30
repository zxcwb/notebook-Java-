package 集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

//关于集合的遍历/迭代
public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c1 = new ArrayList();//ArrayList集合有序可重复

        //添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        //迭代集合
        Iterator it = c1.iterator();
        while (it.hasNext()){
            //存进去什么类型，取出来什么类型
            Object obj = it.next();
            if (obj instanceof Integer){
                System.out.println("Integer类型");
            }
            //输出的时候会转换成字符串，这里Println会调用toString()方法
            System.out.println(obj);
        }

        //HashSet:无序不可重复
        Collection c2 = new HashSet();
        //无序：存进去的和取出来的顺序不一样
        //不可重复：存储100，不能在存储100
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(90);
        c2.add(400);
        c2.add(50);
        c2.add(60);
        c2.add(100);
        Iterator it2  = c2.iterator();
        while (it2.hasNext()){
            Object obj = it2.next();
            System.out.println(obj);
        }
    }
}
