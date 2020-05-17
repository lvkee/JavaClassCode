import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节流读数据（一次读一个字节数组数据）
 * 什么是容器？
 * 1.创建字节数组，长度为1024的整数倍
 * 2.定义一个整数型变量len
 * 3.使用read(byte[] b)方法，从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 * 4.使用String(byte[] n, int offset, int len)将字节数组转化为字符串，再打印出来
 */
public class ByteArray {
    public static void main(String[] args) throws IOException {
        byte[] bys = new byte[1024];
        int len;
        FileInputStream fis = new FileInputStream("G:\\exp10\\Test.txt");
        if ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }
//        System.out.println((char)fis.read());
//        System.out.print(new String(bys, 0, len));
//        while((len = fis.read(bys)) != -1) {
//            System.out.print(len);
//        }
        fis.close();
    }
}
