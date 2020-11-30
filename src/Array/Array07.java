package Array;
/*
二维数组是特殊的一维数组，二维数组里的每个元素是一个一维数组
三维数组是特殊的二维数组，特殊在这个二维数组中每个元素是一个一维数组
二维数组静态初始化
        int[][] array = {{1,1,1},{2,3,4,5},{0,0,0,0},{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}};
 */
public class Array07 {
    public static void main(String[] args) {
        int[] array = {100,200,300};
        System.out.println(array.length);

        //二维数组
        int[][] a = {
                {100},
                {200},
                {300}
        };
        System.out.println(a.length);//3
        System.out.println(a[1].length);//1
        System.out.println(a[0][0]);
    }
}
