package Array;
public class Array05 {
    public static void main(String[] args) {
        int[] arr ={1,23,4};
        arr[2] = 24;
        System.out.println(arr[2]);
        System.out.println(arr);
        Animal animal = new Animal();
        Animal[] arr1 = new Animal[1];
        arr1[0] = animal;
        for (int i = 0;i<arr1.length;i++){
            arr1[i].move();
        }
        System.out.println("------------------------");
        Animal[] arr2 = new Animal[2];
        Animal bird =  new Bird();
        Animal dog = new Dog();
        arr2[0]=  bird;
        arr2[1] = dog;
     for (int i = 0;i<arr2.length;i++){
         //调用子类特有的方法需要向下转型
         if (arr2[i] instanceof Bird){
             Bird bird1 = (Bird) arr2[i];
             bird1.fly();
             bird1.move();
         }
     }
     }
}
class  Animal{
    public  void  move(){
        System.out.println("动物在移动！");
    }
}
class Bird extends  Animal{
    public void  fly(){
        System.out.println("鸟儿在飞翔！");
    }
}
class Dog extends  Animal{
    public void  sound(){
        System.out.println("狗在吠");
    }
}