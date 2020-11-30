package IO.File类;

import java.io.File;
import java.io.IOException;

public class FileTest04 {
    public static void main(String[] args) {
/*        File file = new File("F:\\IdeaProjects\\Project\\zxc.txt");
        String name = file.getName(); //获取文件名
        System.out.println(name);
        long f = file.length();
        System.out.println(f);
        String path = file.getAbsolutePath();
        System.out.println(path);
        boolean b = file.canWrite();
        boolean c = file.canRead();
        System.out.println(b);
        System.out.println(c);
        boolean d = file.isHidden();
        System.out.println(d);*/

      /*  File file = new File("F:\\IdeaProjects\\Project\\复习Java第一次\\Demo");
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("文件已存在");
            file.delete();
            Thread thread = new Thread();
            try {
                thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (file.exists()){
                System.out.println("文件删除失败");
            }else {
                System.out.println("文件删除成功");
            }
        }*/
      File f = new File("F:\\IdeaProjects\\Project\\复习Java第一次\\Demo");
      if (!f.exists()){
          f.mkdir();
          System.out.println("文件夹创建成功！");
      }else {
          System.out.println("文件夹已存在！");
          Thread thread = new Thread();
          try {
              thread.sleep(3000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }finally {
              f.delete();
              if (f.exists()){
                  System.out.println("文件夹删除失败");
              }else {
                  System.out.println("文件夹删除成功");
              }
          }
      }
    }
}
