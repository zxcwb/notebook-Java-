package Array;
//二维数组的遍历
public class Array08 {
    public static void main(String[] args) {
        int[][] arr  = {
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };
        for(int i = 0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
        //动态初始化二维数组
        int[][] array = new int[3][4];
        for (int i = 0;i<array.length;i++){
            for (int j = 0 ;j<array.length;j++){
                System.out.println(array[i][j]);
            }
        }
        int[][] a = {{1,2,3,4},{4,5,6,76},{1,23,4}};
        Array08 array08 = new Array08();
        array08.printArray(a);
    }
    public  void printArray(int[][] array){
        for (int i = 0;i<array.length;i++){
            for (int j = 0 ;j<array.length;j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
