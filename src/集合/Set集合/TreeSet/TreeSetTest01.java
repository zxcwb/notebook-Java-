package 集合.Set集合.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        //自动排序
        stringSet.add("D");
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("E");
        stringSet.add("F");
        for (String s : stringSet){
            System.out.println(s);
        }
    }
}
