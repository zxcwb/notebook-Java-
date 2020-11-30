package Method.Test2;

public class MethodTest01 {
    public static void main(String[] args) {
        sum(2.33,2,3.33);
       String  s1 = new String("china");
       System.out.println(s1);

       Animal animal = new Animal("猫");
       System.out.println(animal.name);

 }

public  static  void  sum(double n1,int n2,double n3){
        double sum =  n1+n2+n3;
        System.out.println(sum);
}
public static void sum(int n2,double n1){
    double sum =  n1+n2;
    System.out.println(sum);
}
}
class Animal{
      String name;

//    @Override
//    public String toString() {
//        return name;
//    }

    public Animal(String name){
        this.name = name;
    }
}
