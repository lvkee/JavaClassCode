package FIS_Statistics;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 目的：统计桌面上bigbook.txt中包含英文字母"A"的个数，并显示统计的时间
 * 显示统计时间：
 * 1.long begin = System.currentTimeMillis();
 * 2.long end = System.currentTimeMillis() - begin;
 * 3.System.out.println("耗时：" + end + "毫秒");
 * 统计字符个数：
 * 1.创建字节输入流对象，将对象定向到桌面文件bigbook.txt
 * 2.使用while()循环进行统计
 * 3.在控制台打印统计个数
 * 4.释放资源
 */
public class FIS_Statistics {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int b;
        long begin = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\19869\\OneDrive\\桌面\\bigbook.txt");
        while ((b = fis.read()) != -1) {
//            System.out.println((char)fis.read());
            if (b == 65) {
                count++;
            }
        }
        long end = System.currentTimeMillis() - begin;
        fis.close();
        System.out.println("文本中“A”出现了" + count + "次");
        System.out.println("统计共耗时" + end + "ms");
        fis.close();
    }
}
