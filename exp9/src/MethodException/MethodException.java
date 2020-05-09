package MethodException;

class MethodException {
    static void m() throws ArithmeticException//方法m抛出Exception
    {
        int a = 3;
        int b = 0;
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }

    public static void main(String[] args) {
        m();   //调用方法m（）,捕获产生的异常，显示异常信息
        System.out.println("程序结束");
    }
}