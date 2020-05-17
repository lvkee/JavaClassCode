import java.util.Scanner;

/**
 * 分别使用for循环和递归方法来求阶乘
 * 需要求的阶乘从键盘输入
 */
public class Recursion_Factorial {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.println("您要计算的阶乘是：");
        int n = f.nextInt();
        System.out.println("结果为：" + recursion(n));
    }
// StackOverflowError
    public static int recursion(int n) {
        if (n == 1)
            return 1;
        else
            return n * recursion(n-1);
    }
}
