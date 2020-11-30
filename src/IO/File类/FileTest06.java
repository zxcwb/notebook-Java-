package IO.File类;

import java.io.File;

public class FileTest06 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\jay zhou\\Desktop\\a");
        deleteAll(f);
    }
    private static void deleteAll(File f){
        File[] fs = f.listFiles();
        for (int i = 0;i<fs.length;i++){
            File ff = fs[i];
            if (ff.isFile()){
                ff.delete();
            }else {
                ff.delete();
                if (ff.exists()) {
                    deleteAll(ff);
                    ff.exists();
                }
            }
        }
    }
}
