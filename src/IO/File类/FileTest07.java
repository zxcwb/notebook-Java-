package IO.File类;

import java.io.File;

public class FileTest07 {
    public static void main(String[] args) {

    }
    private static void find(File f){
        File[] fs = f.listFiles();
        for (int i = 0;i < fs.length;i++){
            File ff = fs[i];
            if (ff.isFile()) {
                String name = ff.getName();
                System.out.println(name);
            }else {

            }
        }
    }
}
