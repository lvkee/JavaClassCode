import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 创建一个元素十字符串的ArrayList对象，在其中添加若干元素。编写程序，用下面3种方法将其中每个字符串转成大写。
 * （1）使用索引循环访问
 * （2）使用迭代器
 * （3）使用replaceAll（）方法
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("god");
        al.add("bless");
        al.add("you");
        // 使用索引循环访问
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            System.out.println(s.toUpperCase());
        }
        System.out.println("--------");
        // 使用迭代器
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s.toUpperCase());
        }
        System.out.println("--------");
        // 使用replaceAll（）方法
        al.replaceAll(String::toUpperCase);
        System.out.println(al);
    }
}
