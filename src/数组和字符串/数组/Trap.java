package 数组和字符串.数组;

public class Trap {
    public static void main(String[] args) {
         int b[][] = new int[][]{{1},{2,3},{4,5,6}};
         for (int i = 0;i<b.length;i++){
             for (int j = 0;j<b[i].length;j++){
                 System.out.println(b[i][j]);
             }
         }
    }
}
