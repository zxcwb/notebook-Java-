package Array;

public class Array09 {
    public static void main(String[] args) {
        //这里需要注意,字符串不需要new对象，数组什么引用类型都能够装得下
        String str  = new String();
        wife w = new wife();
        husband h = new husband();
        Animals a = new Animals();
        Object[]  arr = {str,w,h,a,"abc"};
    }
}
class wife{}
class husband{}
class Animals{}