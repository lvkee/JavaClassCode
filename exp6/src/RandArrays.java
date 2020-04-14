//: exp6:RandArrays.java

import java.util.Arrays;
import java.util.Random;

public class RandArrays {
    public static void main(String[] args) {
        int[]a = new int[10];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.abs(rand.nextInt(10));
        }
        System.out.println("随机生成的数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println("\n经过排序后的数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
