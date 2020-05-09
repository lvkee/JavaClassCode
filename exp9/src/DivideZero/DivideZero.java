package DivideZero;

/*
 * 编写一个程序，这个程序能处理除零异常。
 * */
public class DivideZero {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 3 / x;
            System.out.println("程序结束");
        } catch (ArithmeticException e) {
            e.printStackTrace(); //在console中输出异常信息
            System.out.println("oops！程序出错，请检查后重试");
        }

    }
}
