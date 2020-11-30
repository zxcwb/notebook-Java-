package 常用类.String类与StringBuffer;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        //"hello"是存储在方法区的字符串常量池中
        //所以这个"hello"不会新建。（因为这个对象以经存在）
        String s2 = "hello";
        //== 比较的是两个变量中保存的内存地址
        System.out.println(s1==s2);//true

        String x = new String("xyz");
        String y = new String("xyz");
        System.out.println(x==y);//false

        //通过以上实验，字符串"对象"之间的比较不能使用"=="
        //"=="那就不能使用了，应该调用String类的equals方法
        //重点：String类以经重写了equals方法。
        System.out.println(x.equals(y));

        String a = new String("teststring");
        a=null;
        //System.out.println(a.equals("teststring"));//这样写容易出现空指针异常
        //equals()-->将此字符串与指定的对象比较。当且仅当该参数不为 null，并且是与此对象表示相同字符序列的 String 对象时，结果才为 true。
        // 因为"testString"是一个String字符串对象。只要是对象都能调用方法。
        System.out.println("teststring".equals(a));
    }
}
