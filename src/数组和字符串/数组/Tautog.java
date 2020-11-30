package 数组和字符串.数组;

public class Tautog {
    public static void main(String[] args) {
        int arr2[][] = {{4,3},{1,2}};
        System.out.print("数组的元素是：");
        int i = 0;
        for (int[] arr3 : arr2){
            i++;
            int j =  0;
            for (int e : arr3){
                j++;
                if (i == arr2.length&& j == arr3.length){
                    System.out.print(e);
                }else {
                    System.out.print(e+"、");
                }
            }
        }
    }
}
