import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 目的：将桌面上的Test.txt内的诗歌文本复制到exp10目录下的Test.txt中
 * 步骤：
 * 1.对桌面上的Test.txt创建字节输入流，对exp10目录下的Test.txt创建字节输出流
 * 2.用循环的形式，将单个字符从桌面上的Test.txt中读取出来，写入exp10目录下的Test.java
 * 3.释放资源
 */
public class CopyWithStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\19869\\OneDrive\\桌面\\Test.txt");
        FileOutputStream fos = new FileOutputStream("G:\\exp10\\Test.txt", true);
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
