package 数组和字符串.数组;

import java.util.Arrays;

public class Cope {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int[] newarr = Arrays.copyOf(arr,7);
        for (int i = 0;i<newarr.length;i++){
            System.out.println(newarr[i]);//当数组长度不够的时候会自动补零
        }
    }
}
