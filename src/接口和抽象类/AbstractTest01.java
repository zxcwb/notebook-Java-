package 接口和抽象类;
/*
抽象类：
类和类之间的共同特征被提取出来，形成抽象类
抽象类本身是不存在的，所以不能被实例化
引用数据类型
抽象类语法：
【修饰符列表】 abstract class 类名{}
抽象类是用来被子类继承的
final和abstract两个关键字是对立的，不能联合使用
抽象类的子类可以是抽象类也可以是非抽象类
抽象类可以减轻类在实现接口类过程中的开发难度
抽象类无法实例化对象，但是有构造方法，这个构造方法是提供给子类使用的
如果抽象类中提供了有参数的构造方法，那么也一定要有有参数的构造方法，不然子类就无法使用无参的构造方法来实例化对象了
抽象类关联到一个概念：抽象方法。什么是抽象方法呢？
			抽象方法表示没有实现的方法，没有方法体的方法。例如：
				public abstract void doSome();
				抽象方法特点是：
					特点1：没有方法体，以分号结尾。
					特点2：前面修饰符列表中有abstract关键字。
抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
抽象类中不一定有抽象方法但是抽象方法一定出现在抽象类当中
 */
public class AbstractTest01 {
    public static void main(String[] args) {
   //animal animal = new animal();无法实例化对象
    }
}
abstract class animal{}
abstract class bird extends  animal{}
class Animals extends  animal{}
//class Animalss extends  animal,bird{}不能多继承
class dog extends bird{}//虽然类之间无法多继承，但是可以通过间接的方式来实现多继承
