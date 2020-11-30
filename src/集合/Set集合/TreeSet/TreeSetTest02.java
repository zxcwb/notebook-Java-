package 集合.Set集合.TreeSet;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
     /*   TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("wangwu");
        treeSet.add("sunwukong");
        treeSet.add("xubajie");
        for (String str : treeSet){
            System.out.println(str);
        }*/
            Person p1 = new Person(32);
            //System.out.println(p1);
            Person p2 = new Person(20);
            Person p3 = new Person(30);
            Person p4 = new Person(25);

            // 创建TreeSet集合
            TreeSet<Person> persons = new TreeSet<>();
            // 添加元素
            persons.add(p1);
            persons.add(p2);
            persons.add(p3);
            persons.add(p4);

            // 遍历
            for (Person p : persons){
                System.out.println(p);
            }

        }
    }




