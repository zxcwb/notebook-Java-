package Array;
/*
java开发中，数组长度一旦确定就不可变
那么数组一旦满了就需要扩容：
方法就是先建一个大容量数组，然后把小容量数组一个一个拷贝到大数组中
建议：
数组扩容效率较低，因为涉及到数组拷贝问题，所以在开发中最好是确定好数组的长度

 */
public class Array06 {
    public static void main(String[] args) {
        /*
        arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
         */
      //需要被拷贝的数组
        int[] src ={1,23,4,5};

        //拷贝目标
        int[] dest = new int[20];

        System.arraycopy(src,1,dest,3,2);
        //这里表示从第src二个开始拷贝，拷贝到dest从第四个开始接收，拷贝长度为2.
        for (int arr:dest){
            System.out.println(arr);
        }
    }
}
