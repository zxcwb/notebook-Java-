package 常用类.String类与StringBuffer;
//分析以下程序一共创建了几个对象
public class StringTest03 {
    public static void main(String[] args) {
        /*
        一共是3个对象
        方法区字符串常量池一个
        堆内存有两个String对象
         */
       String s1 = new String("hello");
       String s2 = new String("hello");
    }
}
