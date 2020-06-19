import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 用FileOutputStream类将字符串写入文件，用FileInputStream类读出文件。完成文件的复制。（比如：d:\file.txt复制到其他位置）
 */
public class IO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\test.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\19869\\OneDrive\\桌面\\test.txt");
        int len;
        while ((len = fis.read()) != -1) {
            fos.write((char)len);
        }
        fis.close();
        fos.close();
    }
}
