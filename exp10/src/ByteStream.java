import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 解决用字节流写数据的两个问题：
 * 1.实现换行
 * -加上"\r\n".getBytes()
 * 2.实现追加（及在文本最后写入数据）
 * -使用FileOutputStream(String name, boolean append)
 * --append为true，则在文件最后写入数据
 * --append为false，则在文件最开始写入数据
 *
 * finally语句保证执行
 * 在字节流写数据时处理异常用try{}...catch{}...finally{}写的代码健壮性更好
 * 要注意的是：
 * 1.将字节输出流定义放在try{}...catch{}...finally{}结构的外面，因为catch{}和finally{}无法直接使用try{}中生成的对象
 * 2.将定义在try{}...catch{}...finally{}结构外面的字节输出流对象初始化，初始化的值为null
 * 3.finally{}中释放资源前应对字节输出流对象进行判断，如果非空才能进行释放，否则产生空指针异常
 */
public class ByteStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("G:\\exp10\\ByteStreamTest.txt", true);
            for (int i = 0; i < 10; i++) {
                fos.write("How are you today:)".getBytes());
                fos.write("\r\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
