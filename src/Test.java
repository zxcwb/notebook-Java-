public abstract class  Test{
    abstract void add();
    static {
        System.out.println("zxc静态方法");
    }
    {
        System.out.println("zxc实例代码块");
    }
    String name="zxc";
//  final  static  int age=0;
    public Test() {
    }

    public  Test(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
      Test test = new animal();
       System.out.println(test.name);

//        if (test instanceof animal){
//         animal animal = (animal)test;
//         animal.sum();
//        }
        test.sum();
       // System.out.println(test instanceof animal);
}
 public void sum(){
    System.out.println("Test的sum()");
}
}
class animal extends Test{

    @Override
  public   void add() {

    }

    public   void  sum(){
        String name = super.name;
        System.out.println(name);
        System.out.println("实例方法");
    }
}
class  dog extends  animal implements Cat,gg  {

}
interface  Cat {

}
interface  gg{

}
interface  ff{

}