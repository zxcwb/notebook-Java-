package 封装继承多态;

public class First {
    public static void main(String[] args) {
        Person personChina = new Chinese();
        personChina.say();
    }
}
abstract class Person{
    String name;
    abstract void say();
}
class Chinese extends Person{
    @Override
    void say() {
        System.out.println("我是中国人");
    }
}
