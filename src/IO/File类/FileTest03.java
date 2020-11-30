package IO.File类;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下所有子文件
        File f = new File("C:\\Users\\jay zhou\\Desktop\\a\\b");
        File[] files = f.listFiles();
        for (File file:files
             ) {
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}
