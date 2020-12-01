package 数组和字符串.数组;

public class SelectSort {
    public static void main(String[] args) {
          int[] array = new int[]{65,67,78,23,65};
          SelectSort.sort(array);
    }

    public static void sort(int[] array){
        int index;
        for (int i = 1;i<array.length;i++){  // 外层循环（数组长度-1）次
            index = 0;
            for (int j = 1;j<=array.length-i;j++){  //内层循环(数组长度)次
                if (array[j]>array[index]){
                    index = j; // 保存最大元素的索引
                }
            }
            int temp = array[array.length-i];
            array[array.length-i] = array[index];
            array[index] = temp;
        }
        showArray(array);
    }

    public static void showArray(int[] array){
        for (int i : array){
            System.out.print(i+"<");
        }
        System.out.println();
    }
}
