package IO.RandomAccessFile;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RAF01 {
    public static void main(String[] args) throws IOException {
        /* File f = new File("");
        RandomAccessFile raf = new RandomAccessFile(f,"rw");*/
        //不存在该文件自动创建
        RandomAccessFile raf1 = new RandomAccessFile("C:\\Users\\jay zhou\\Desktop\\a\\b\\c\\a.txt","rw");
        int len = -1;
        long start = System.currentTimeMillis();
        byte[] data = new byte[10240];
        while ((len = raf1.read(data))!=-1){
            raf1.write(data,0,len);
        }
        System.out.println("复制完成");
        long end = System.currentTimeMillis();
        System.out.println("复制用时"+(end-start));


        /* raf1.write(1);
        System.out.println("数据输出完毕");
        raf1.close();*/
    }
}
