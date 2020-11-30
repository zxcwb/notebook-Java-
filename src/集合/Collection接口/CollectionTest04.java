package 集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的Contains方法：
boolean contains(Object o)
判断集合中是否包含某个对象o
如果包含返回true， 如果不包含返回false。

contains方法是用来判断集合中是否包含某个元素的方法，
那么它在底层是怎么判断集合中是否包含某个元素的呢？
调用了equals方法进行比对。
equals方法返回true，就表示包含这个元素。
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("123");
        c.add(s1);
        String s2 = new String("abc");
        c.add(s2);

        System.out.println(c.size());//2

        //新建的String对象
        String x = new String("abc");
        //c集合中是否包含x？
        //如果此 collection 包含指定的元素，则返回 true。更确切地讲，
        // 当且仅当此 collection 至少包含一个满足
        // (o==null ? e==null : o.equals(e)) 的元素 e 时，返回 true。
        System.out.println(c.contains(x));//true
        //底层调用了equals方法，所以返回true
        //并且String类型重写了toString()方法，所以equals比较的是内容
    }
}
