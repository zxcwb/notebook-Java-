package 集合.List;

import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        List vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.add(11);

        Iterator iterable = vector.iterator();
        while (iterable.hasNext()){
            Object object = iterable.next();
            System.out.println(object);
        }

        List myList = new ArrayList();
        Collections.synchronizedList(myList);

        myList.add("123");
        myList.add("222");
        myList.add("333");
        System.out.println("----------------------");
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            String string = (String)iterator.next();
            System.out.println(string);
        }
    }
}
