package 数组和字符串.数组;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] array = {1,2};
        int array2[] = {3,4};
        System.out.println(array);
        System.out.println(array2);
        int month[] = new int[12];

        int day[] = new int[]{31,28,31,30,31,31,30,31,30,31};
        for (int i = 0;i < 10;i++){
            System.out.println((i+1)+"月，有多少"+day[i]+"天");
        }
    }
}
