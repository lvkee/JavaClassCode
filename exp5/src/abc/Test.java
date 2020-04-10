package abc;
import cn.edu.zucc.cs.MyMath;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        int []ar = new int[10];
        double []br = new double[10];
        Random rand = new Random();
        System.out.println("数组ar[10]：");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Math.abs(rand.nextInt(100));
            System.out.print(ar[i] + " ");

        }
        System.out.println("\n");
        System.out.println("数组br[10]：");
        for (int i = 0; i < br.length; i++) {
            br[i] = Math.abs(rand.nextInt(100));
            System.out.print(br[i] + " ");
        }
        MyMath t = new MyMath();
        System.out.println("\n数组ar[]（int）的最大值为： " + t.max(ar) +
                "\n数组ar[](double)的最大值为 : " + t.max(br) +
                "\n数组ar[]（int）的最小值为： " + t.min(ar) +
                "\n数组ar[](double)的最小值为 : " + t.min(br)
        );
        t.sort(br);
        System.out.println("经过排序后的数组br[]：");
        for (int i = 0; i < br.length; i++ ) {
            System.out.print(br[i] + " ");
        }
    }
}
