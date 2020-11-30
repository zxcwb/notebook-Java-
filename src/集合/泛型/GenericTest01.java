package 集合.泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1、JDK5.0之后推出的新特性：泛型
2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型没用！）
3、使用了泛型好处是什么？
    第一：集合中存储的元素类型统一了。
    第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的“向下转型”！

4、泛型的缺点是什么？
    导致集合中存储的元素缺乏多样性！
    大多数业务中，集合中元素的类型还是统一的。所以这种泛型特性被大家所认可。
 */
public class GenericTest01 {
    public static void main(String[] args) {
       //不使用泛型
        List myList = new ArrayList();

        //准备对象
        Cat cat = new Cat();
        Bird bird = new Bird();

        myList.add(cat);
        myList.add(bird);

        //获取迭代器
        //这个代表迭代的是Animal类型
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            /*
              //使用泛型之后，每一次迭代返回的数据都是Animal类型
            Animal a = it.next();
            //这里不需要进行强制类型转换。直接调用
            a.move();
             */


            //调用子类特有方法需要强制转换类型
            Animal a = it.next();
            if (a instanceof  Cat){
                Cat x = (Cat)a;
                x.catchMouse();
            }
            if (a instanceof Bird){
                Bird b = (Bird)a;
                b.fly();
            }
        }

        //将对象添加到集合当中
    }
}
class Animal {
    // 父类自带方法
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal {
    // 特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}

class Bird extends Animal {
    // 特有方法
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }
}