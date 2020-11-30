package 方法题目;
/*
编写一个方法，输出大于某个正整数n的最小的质数。
思考：这个方法应该起什么名字，这个方法的形参是什么，方法的返回值类型是什么。

 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(minzhishu(9));
    }
    public static int minzhishu(int num){
        while (true){
            num++;
            if (num%2==0){
                continue;
            }else {
                boolean flag = true;
                for (int i = 2;i<=Math.sqrt(num);i++){
                    if (num%i==0){
                        flag = false;
                    }
                }
                if (flag){
                    return  num;
                }
            }
        }
    }
}
