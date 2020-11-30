package 集合.Set集合.TreeSet;

public class Person implements Comparable<Person>{
    int age;
    public Person(int age){
        this.age = age;
    }

    // 重写toString()方法
    public String toString(){
        return "Person[age="+age+"]";
    }

    @Override
    public int compareTo(Person o) {
      return   o.age - this.age;
    }
}
