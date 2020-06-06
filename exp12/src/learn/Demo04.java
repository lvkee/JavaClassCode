/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

*/
/*
 *
 * 创建一个List储存学生对象并遍历打印在控制台上
 *//*


public class Demo04 {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
        Student s1 = new Student("Chris", 18);
        Student s2 = new Student("Pony", 19);
        Student s3 = new Student("Jack", 20);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        // 使用迭代器进行遍历输出
//        Iterator<Student> it = l.iterator();
        */
/*while (it.hasNext()) {
            Student s = it.next();
            System.out.println("Students'name:" + s.getName() + "\n" +
                    "Students's age:" + s.getAge());
        }*//*


        // 使用索引遍历
        */
/*for (int i = 0; i < l.size(); i++) {
            int age = l.get(i).getAge();
            String name = l.get(i).getName();
            System.out.println("Students'name:" + name + "\n" +
                    "Students's age:" + age);
        }*//*


        // 使用ListIterator遍历
        */
/*ListIterator<Student> lit = l.listIterator();
        while (lit.hasNext()) {
            Student s = lit.next();
            System.out.println("Students'name:" + s.getName() + "\n" +
                    "Students's age:" + s.getAge());
        }
        System.out.println("--------");
        while (lit.hasPrevious()) {
            Student s = lit.previous();
            System.out.println("Students'name:" + s.getName() + "\n" +
                    "Students's age:" + s.getAge());
        }*//*

        for (Student s : l) {
            System.out.println("Students'name:" + s.getName() + "\n" +
                    "Students's age:" + s.getAge());
        }
    }
}
*/
