package 集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用以前老的迭代器，会出现
    异常：java.util.ConcurrentModificationException

    重点：在迭代集合元素的过程中，不能调用集合对象的remove方法，删除元素：
        c.remove(o); 迭代过程中不能这样。
        会出现：java.util.ConcurrentModificationException

    重点：在迭代元素的过程当中，一定要使用迭代器Iterator的remove方法，删除元素，
    不要使用集合自带的remove方法删除元素。

 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        // 注意：此时获取的迭代器，指向的是那是集合中没有元素状态下的迭代器。
        // 一定要注意：集合结构只要发生改变，迭代器必须重新获取。
        // 当集合结构发生了改变，迭代器没有重新获取时，调用next()方法时：java.util.ConcurrentModificationException
        Iterator it = c.iterator();
    }
}
