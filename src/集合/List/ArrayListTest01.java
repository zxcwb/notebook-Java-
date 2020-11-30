package 集合.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        System.out.println(list1.size());
        List list2 = new ArrayList(20);
        System.out.println(list2.size());
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1.size());
        list1.add(6);
        System.out.println(list1.size());

    }
}
