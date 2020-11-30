package Method.Test2;
/*
一、请通过代码封装，实现如下需求：
	编写一个类Book，代表教材:
	1.具有属性：名称（title）、页数（pageNum）
	2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
	3.为各属性提供赋值和取值方法
	4.具有方法:detail，用来在控制台输出每本教材的名称和页数
	5.编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确

二、写一个名为Account的类模拟账户。
该类的属性和方法如下所示。
该类包括的属性：账户id，余额balance，年利率annualInterestRate；
包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()

写一个测试程序
（1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
（2）对Jane Smith操作：
存入100元，再取出960元，再取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0

三、(封装)已知一个类 Student 代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
要求：
	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的地址和邮编。
 */
public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.detail();
    }
}
