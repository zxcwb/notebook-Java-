package 方法题目;
/*
、编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println( jiecheng(5));
    }
    public static int jiecheng(int num){
        for (int i = num;i>1;i--) {
            num*=(i-1);
        }
        return  num;
    }
}
