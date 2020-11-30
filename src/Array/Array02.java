package Array;

public class Array02 {
    public static void main(String[] args) {
        //创建一个int类型的数组
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        printArray(arr);
        //创建一个String类型的数组
        String[] strarr = new String[3];
        printArray(strarr);
        printArray(new int[5]);
        int[] arr1 ={1,2,3,4,};
        printArray(arr1);
       // printArray({1,2,3,4});-->这种写法是错误的！
    }
    //写一个遍历数组的方法
    public  static  void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public  static  void printArray(String[] arr){//方法的重载
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
