/**
 * Realize the Fibonacci sequence:1,1,2,3,5,8,13...
 */
public class Recursion {
    public static void main(String[] args) {
        int[] f = new int[5];
//        System.out.println(f);
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println(f[4]);
        System.out.println(recursion(5));
    }
/**
* 定义递归方法recursion()实现和主函数中for循环同样的效果
*/
    public static int recursion(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return recursion(n - 1) + recursion(n - 2);
    }
}
