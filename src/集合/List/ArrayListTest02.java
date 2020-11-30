package 集合.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest02 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        List myList2 = new ArrayList(100);

        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);
        List myList3 = new ArrayList(c);
        for (int i = 0;i<myList3.size();i++){
            System.out.println(myList3.get(i));
        }
    }
}
