package GetLineNum;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将一个文本文件的内容按行读出，每读出一行就顺序加上行号，并写入到另一个文件中
 * 实现：
 * 1.创建字节输入流对象，将该对象定义到桌面上的text.txt文件
 * 创建字节输出流对象，将该对象定义到桌面上的text3.txt中
 * 2.使用while循环
 * -一次读一个字节数组数据，将text.txt中内容储存到字节数组中，
 * -对字节数组循环，每次循环写入count，遇到"\n"后count++,
 *3.释放资源
 */
public class GetLineNum {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\19869\\OneDrive\\桌面\\Test.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\19869\\OneDrive\\桌面\\Test3.txt", true);
        byte[] bys = new byte[1024];
        int i = 0;
        int count = 1;
        int len; //字节数组的大小
        if ((len = fis.read(bys)) != -1) {
            fos.write((Integer.toString(count)+"···").getBytes());//标号1
            while (bys[i] != -1) {
                fos.write(bys[i]);
                if (bys[i] == 13) {
                    count++; //行数+1
                    i++; //不将\n写入text3.txt
                    fos.write((Integer.toString(count)+"···").getBytes());
                }
                try {
                    if (bys[i+1] == -1)
                        break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                } //异常处理：避免数组越界问题
                i++;
            }
        }
        fos.close();
        fis.close();
    }
}
