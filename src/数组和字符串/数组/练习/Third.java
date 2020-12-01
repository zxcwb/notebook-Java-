package 数组和字符串.数组.练习;

import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
        String arr[] = new String[]{"ab","bc","cd","de","ef"};
        showArray(arr);
        Arrays.fill(arr,2,3,"bb");
        showArray(arr);
    }
    public static void showArray(String[] array){
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
