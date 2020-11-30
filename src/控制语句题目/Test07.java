package 控制语句题目;

import java.math.BigDecimal;

public class Test07 {
    public static void main(String[] args) {
        BigDecimal num = new BigDecimal(1);

        for(int i = 1; i <= 100; i++){
           num = num.multiply(new BigDecimal(i));
        }

        System.out.println(num);

    }
}
