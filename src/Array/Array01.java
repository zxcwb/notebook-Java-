package Array;

public class Array01 {
    public static void main(String[] args) {
        int[] arr =new int[5];
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
            //int 类型默认值为0
        }
        System.out.println("------------------------");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 3;
        arr[4] = 4;
        for (int arr1:arr) {//foreach遍历数组
            System.out.println(arr1);
        }
        System.out.println("---------------------------");
        Object[] obj  = new Object[3];
        for(Object objarr: obj){
            System.out.println(objarr);
            //输出的值为null，说明数组动态初始化引用数据类型的数组值为null。（未赋值）
        }
        System.out.println("-------------静态初始化数组------------------");
        //静态初始化数组
        String[] strarr = {"a","b","c"};
        for (String str : strarr){
        System.out.println(str);
        //输出静态初始化数组默认值。
       }
        System.out.println("---------------");
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object[] objarr =  new Object[3];
        for (Object objarrs:objarr
             ) {
            System.out.println(objarrs);
        }
        objarr[0]  = obj1;
        objarr[1]  = obj2;
        objarr[2] = obj3;
        for (Object objarrs:objarr
        ) {
            System.out.println(objarrs);
            //通过这里的例子可以证明数组储存引用数据类型储存的是对象的内存地址
        }
        for(int i = 1;i<objarr.length+1;i++){//如果这里这样写的话，会抛出数组下标越界异常。
            System.out.println(objarr[i]);
        }
    }
}
