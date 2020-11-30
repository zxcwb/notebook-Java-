package 集合.Collection接口;

import java.util.*;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类，方便集合的操作。
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayTest集合不是线程安全的
        List<String> list= new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("abf");
        list.add("abx");
        list.add("abc");
        list.add("abe");

        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }

        //对Set集合排序
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        //将Set集合转换为List集合
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for (String s:myList){
            System.out.println(s);
        }
    }
}
