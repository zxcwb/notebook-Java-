package this和static关键字;
/*
this：
this是一个关键字，全部小写
this是一个变量，一个引用。this用来保存当前对象的内存地址
this严格意义上讲，this代表的就是“当前对象”
this存储在堆内存当中对象的内部

this只能使用在实例方法中。谁调用这个实例方法，this就是谁。
this代表当前对象

“this”大部分情况下是可以省略的

this代表当前对象，静态方法中不存在当前对象
 */
public class thisTest01 {
    private String name;
    public static void main(String[] args) {
        //实例方法只能通过new对象来使用
        thisTest01 t = new thisTest01();
        t.test02();
        /*
        thisTest01();
        test02();
         */
        //静态方法有两种方式调用，在同类中直接调用，不在同类需要在前面加上类名.test()
        test();
        thisTest01.test();

    }
    //静态方法
    public static void test(){
        //this.name =name;静态方法无法使用this关键字
        System.out.println("我是静态方法test！");
    }
    //构造方法也是实例方法的一种
    public thisTest01(){
        this.name = null;
        System.out.println(this.name);
    }
// 实例方法
    public thisTest01(String name) {
        this.name = name;
        System.out.println(this.name);
    }
    //实例方法
    public void test02(){
        this.name =name;
        System.out.println(this.name);
    }
    //重载
    public void  test02(String name){
        this.name = name;
        System.out.println(this.name);
    }
}
