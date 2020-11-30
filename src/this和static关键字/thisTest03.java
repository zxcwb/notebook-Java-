package this和static关键字;
/*
this可以使用在实例方法，不能使用在静态方法中
this关键字大部分情况可以省略
1、在实例方法中，不能省略
2、在构造方法中，不能省略
this.  为了区分局部变量和实例变量

this有个写法比较奇葩
this(实际参数列表)：
作用：通过一个构造方法去调用另外一个构造方法，这样做可以做到代码复用

记忆：
对于this()的调用只能出现在构造方法的第一行


 */
public class thisTest03 {
    private  int no;
    public static void main(String[] args) {
         Date d = new Date();
         d.detail();
    }

    public thisTest03(int no){
        //左边的表示实例变量no，右边表示传进来的局部变量no
        this.no = no;
    }
}
class Date{
    //年
    private int year;
    //月
    private int month;
    //日
    private int day;
    public void detail(){
       // this();
        System.out.println("年"+year+"月"+month+"日"+day);
        System.out.println("年"+this.year+"月"+this.month+"日"+this.day);
    }
    public Date(){
        this(10,10,10);
        System.out.println("年"+year+"月"+month+"日"+day);
        //this(10,10,10);
    }

    public Date(int year, int month, int day) {
       // this(20,10,20);//通过前面和这里可以说明this()只能出现在构造方法第一个语句
        this.year = year;
        this.month = month;
        this.day = day;
    }
}