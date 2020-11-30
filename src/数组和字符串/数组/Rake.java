package 数组和字符串.数组;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rake {
    public static void main(String[] args) {
        String string[] = new String[]{"ab","cd","ef","yz"};
        Arrays.sort(string);
        int index = Arrays.binarySearch(string,0,2,"cd");
        System.out.println(index);//在该范围内查找到该数值，那么就返回1，否则返回-1。


    }
}
