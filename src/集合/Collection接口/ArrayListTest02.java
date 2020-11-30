package 集合.Collection接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

//ArrayList的构造方法
public class ArrayListTest02 {
    public static void main(String[] args) {
        //默认初始化容量10
        List myList1 = new ArrayList();

        //指定容量为100
        List myList2 =  new ArrayList(100);

        //创建一个HashSet集合
        Collection c = new HashSet();
        //添加元素到Set集合
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);

        //通过这个构造方法将HashSet集合转换为List集合
        List myList3 = new ArrayList(c);
        for (int i = 0;i<myList3.size();i++){
            System.out.println(myList3.get(i));
        }
    }
}
