package 集合.Collection接口;
//JDK5.0之后推出了一个新特性：叫做增强for循环，或者叫做foreach
public class ForEachTest01 {
    public static void main(String[] args) {
        //int类型的数组
        int[] arr = {432,4,65,46,54,76,54};
        //遍历数组
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //增强for（foreach）
        //以下是语法
        /*for(元素类型 变量名 : 数组或集合){
            System.out.println(变量名);
        }*/

        System.out.println("foreach缺点是：没有下标，需要使用下标时，不建议使用foreach");


        for (int data : arr){
            //data就是数组中的元素（数组中的每个元素）
            System.out.println(data);
        }

    }
}
