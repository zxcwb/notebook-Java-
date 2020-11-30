package IO.File类;

import java.io.File;
import java.util.List;

public class FileTest05 {
    public static void main(String[] args) {
        File f = new File("F:\\IdeaProjects\\Project");
        File[] subs = f.listFiles();
        for (int i = 0;i < subs.length;i++){
            File sub = subs[i];
            if (sub.isFile()){
                System.out.println(sub.getName());
            }else {
                System.err.println(sub.getName());
            }
        }
    }
    public static void findFile(String filePaths, String fileNames, List fileLists){
        File filePath = new File(filePaths);
        if (!filePath.exists() ||!filePath.isDirectory()){
            System.out.println("文件查找失败！");
        }else {
            String tmp = null;
            File tmpFile;
            File[] files = filePath.listFiles();
            for (int i = 0;i < files.length;i++){

            }
        }
    }
}
