package Father;

import java.util.Scanner;

/**
 * 它包括：
 * 1.内部类Son，表示儿子的类，包括：
 * -数据域phone，表示儿子电话号。
 * -内部类构造方法
 * -callFather方法，给父亲打电话，打印“xxx给yyy打电话”即可，xxx是儿子电话号，yyy是父亲电话号。
 * 2.数据域phone，表示父亲电话号。
 * 3.Son数组，保存儿子。
 * 4.count，保存儿子个数
 * 5.构造函数。
 * 6.给儿子打电话的方法CallSon，打印“给xxx打电话”即可，xxx是儿子电话号。
 * <p>
 * 实现关键：
 * 创建对象数组
 */
public class Father {
    static private String fatherPhone;
    private Son[] Son = new Son[1024]; // 创建对象数组
    private int count;

    class Son {
        private String sonPhone;

        Son() {
        }

        Son(String sonPhone) {
            this.sonPhone = sonPhone;
        }

        void callFather(Father f) {
            System.out.println(sonPhone + "给" + f.fatherPhone + "打电话");
        }
    }

    Father(String fatherPhone) {
        this.fatherPhone = fatherPhone;
    }

    void CallSon(Son s) {
        System.out.println("给" + s.sonPhone + "打电话");
    }

    /**
     * 1.通过带参构造方法先创建Father对象f
     * 2.从键盘输入儿子的个数并赋值给count
     * 3.使用循环通过对象数组创建Son对象
     * 4.调用内部类Son类中方法callFather()和外部类Father类中CallSon()
     * 注意：使用nextLine()方法时会在缓存区吃一个字节
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入父亲的手机号：");
        String fatherPhone = s.nextLine();
        Father f = new Father(fatherPhone);
        System.out.println("--------");
        System.out.println("请输入儿子的个数：");
        f.count = s.nextInt();
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < f.count; i++) {
            System.out.println("请输入第" + (i + 1) + "个儿子的电话号码");
            f.Son[i] = f.new Son(s1.nextLine());
            System.out.println("--------");
        }
        f.Son[0].callFather(f); // 第一个儿子给爸爸打电话
        f.CallSon(f.Son[0]); // 爸爸给第一个儿子打电话
        f.Son[1].callFather(f); // 第二个儿子给爸爸打电话
        f.CallSon(f.Son[1]); // 爸爸给第二个儿子打电话
    }
}
