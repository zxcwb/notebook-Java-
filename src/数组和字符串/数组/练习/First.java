package 数组和字符串.数组.练习;

import java.lang.reflect.Array;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[];
        arr2 = Arrays.copyOf(arr1,3);
        First.showArray(arr1);
        First.showArray(arr2);
    }
    public static void showArray(int[] array){
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
