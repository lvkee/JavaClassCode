package FromKeyboard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 接收键盘输入的字符串，用FileOutputStream类将字符串写入文件，用FileInputStream类读文件内容打印在控制台
 * 1.创建Scanner对象,调用nextLine()方法创建字符串数组，
 * 2.创建标准输出流，使用getbytes()方法将字符串转化为字节数组写入桌面上的test2.txt文件
 * 3.创建标准输入流，读桌面上test2.txt，将字节转化为字符打印到控制台
 * 4.释放资源
 */
public class FromKeyboard {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int b;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\19869\\OneDrive\\桌面\\Test2.txt", true);
        FileInputStream fis = new FileInputStream("C:\\Users\\19869\\OneDrive\\桌面\\Test2.txt");
        fos.write(s.getBytes());
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fos.close();
        fis.close();
//        System.out.println(s);
    }
}
