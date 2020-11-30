package Method.Test2;
/*
请通过代码封装，实现如下需求：
	编写一个类Book，代表教材:
	1.具有属性：名称（title）、页数（pageNum）
	2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
	3.为各属性提供赋值和取值方法
	4.具有方法:detail，用来在控制台输出每本教材的名称和页数
	5.编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
 */
public class Book {
    String name;
    int pageNum;

    //赋值的方法
    public void fuzhi(String name,int pageNum){
        this.name = name;
        this.pageNum = pageNum;
    }

    //定义一个方法输出书的名称和页数
    public  void detail(){
        if (pageNum <200){
            System.out.println("您输入的页数少于200，请重新输入！");
            this.pageNum = 200;
        }
        System.out.println("书的名字="+this.name+","+"页数="+this.pageNum);
    }

    public Book(String name,int pageNum){
        this.name = name;
        this.pageNum = pageNum;
    }

    public Book() {
    }
}
