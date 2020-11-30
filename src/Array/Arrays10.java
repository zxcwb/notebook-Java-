package Array;
import java.util.Arrays;
//在java中SUN公司了数组工具类
public class Arrays10 {
    public static void main(String[] args) {
        int[] arr = {112,3,4,56,67,1};

        // 工具类当中的方法大部分都是静态的。
       Arrays.sort(arr);

        // 遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    }

