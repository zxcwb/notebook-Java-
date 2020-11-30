package 数组和字符串.数组;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {63,4,24,1,3,15};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
    }

    public void sort(int[] array){
        for (int i = 1;i<array.length;i++){
            for (int j = 0;j<array.length-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        showArray(array);
    }

    public void showArray(int[] array){
        for (int i : array){
            System.out.print(i+"<");
        }
        System.out.println();
    }
}
