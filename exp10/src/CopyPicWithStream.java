import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制桌面上基本素材文件夹图片gendar.jpg到exp10的gendar.jpg
 * 一次读一个字节数组数据
 */
public class CopyPicWithStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\19869\\OneDrive\\桌面\\基本素材\\gendar.jpg");
        FileOutputStream fos = new FileOutputStream("G:\\exp10\\gendar.jpg", true);
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b)) != -1) {
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
