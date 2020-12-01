package 数组和字符串.数组.练习;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int arr[] = new int[]{64,53,78,32,99};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        // minNum(arr);
    }

    public static void minNum(int[] array){
       /* int index = 0;
           for(int i = 0;i<array.length;i++){
               for (int j = 1;j<array.length;j++){
                   if (array[i]>array[j]){
                       System.out.println("我进入了");
                       index++;
                   }
               }
               if (index>array.length-1){
                   System.out.println(array[i]);
                   break;
               }else {
                   index = 0;
               }
           }
*/
    }

}
