import java.io.File;

/**
 * 用递归遍历文件目录
 */
//
public class TraverseDir {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\19869\\OneDrive\\桌面\\Hunter_demo");
        bl2(f);
    }

    /**
     * 针对文件的File对象本身操作
     * 1.判断文件的File对象是不是文件夹
     * -是：遍历文件夹的File对象数组，调用bl1()
     * -否：打印文件File对象的绝对路径于控制台
     */
    public static void bl1(File f) {
        if (f.isDirectory() == true) {
            for (int i = 0; i < f.listFiles().length; i++) {
                bl1(f.listFiles()[i]);
            }
        } else
            System.out.println(f.getAbsolutePath());
    }

    /**
     * 创建一个File对象数组指向使用listFiles()返回的文件f的File对象数组，对新数组进行操作
     * 1.判断该数组是否为null
     * 2.遍历数组后判断数组所对应的file对象是否为文件夹
     * -是：调用bl2
     * -否：打印文件File对象的绝对路径于控制台
     */
    public static void bl2(File f) {
        File[] str = f.listFiles();
        if (str != null) {
            for (File file : str) {
                if (file.isDirectory()) {
                    bl2(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
