package 数组和字符串.数组;

import java.util.Arrays;

public class Taxis {
    public static void main(String[] args) {
        int arr[] = new int[]{23,42,12,8};
        Arrays.sort(arr);//对数组进行排序
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
