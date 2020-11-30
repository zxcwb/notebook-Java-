package 数组和字符串.数组;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Arrays.fill(arr,8);
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //如果指定的数组的索引长度大于数组长度，那么会出现数组下标越界异常
    }
}
