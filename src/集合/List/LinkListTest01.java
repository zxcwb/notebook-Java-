package 集合.List;

import java.util.LinkedList;
import java.util.List;

public class LinkListTest01 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0;i<list.size();i++){
            Object object = list.get(i);
            System.out.println(object);
        }
    }

}
