/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

*/
/*使用一下List集合类
  1.有序
  2.元素可重复
  *//*



public class Demo03 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("How");
        l.add("are");
        l.add("you?");
        System.out.println(l);
//        Iterator<String> it = l.iterator();
        ListIterator<String> lit = l.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");
        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }
    }
}
*/
