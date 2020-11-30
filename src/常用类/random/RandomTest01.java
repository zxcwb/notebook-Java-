package 常用类.random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        //随机数
        Random random  = new Random();
        //随机产生一个"int类型取值范围内的数字"
        int num1 = random.nextInt();
        System.out.println(num1);

        //产生【0-100】之间的随机数。不能产生101
        //nextInt翻译为：下一个int类型数据是101，表示只能取到100.
        int num2 = random.nextInt(101);
        System.out.println(num2);
        int num3 = random.nextInt(99);
        System.out.println(num3);
    }
}
