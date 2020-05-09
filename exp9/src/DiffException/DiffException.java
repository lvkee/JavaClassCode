package DiffException;

/*
 * 编写一个程序，在main方法中，输入语句，根据不同的错误捕获相应的异常。
 * （NullPointerException、ClassCastException、NegativeArraySizeException、
 * ArrayIndexOutOfBoundsException）
 */
public class DiffException {

    /*当应用程序试图在需要对象的地方使用 null 时，抛出该异常。这种情况包括：
        调用 null 对象的实例方法。
        访问或修改 null 对象的字段。
        将 null 作为一个数组，获得其长度。
        将 null 作为一个数组，访问或修改其时间片。
        将 null 作为 Throwable 值抛出。*/
    public static void method() {
        int[] a = null;
        try {
            System.out.println(a.length);//将 null 作为一个数组，获得其长度。
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了NullPointerException");
        }
    }


    /*当试图将对象强制转换为不是实例的子类时，抛出该异常。例如，以下代码将生成一个 ClassCastException：

        Object x = new Integer(0);
        System.out.println((String)x);
     */
    public static void method2() {
        Object x = new Integer(0);
        try {
            System.out.println((String) x);
        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("捕获到了ClassCastException");
        }
    }


    /*如果应用程序试图创建大小为负的数组，则抛出该异常。
     * NegativeArraySizeException*/
    public static void method3() {
        try {
            int[] c = new int[-1]; //试图创建大小为负的数组
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
            System.out.println("捕获到了NegativeArraySizeException");
        }
    }

    /*用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。
     * ArrayIndexOutofBoundsException*/
    public static void method4() {
        int[] d = {1, 2, 3};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println("d[" + i + "]=" + d[i]); //索引为负或大于等于数组大小
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("捕获到了ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        method(); //NullPointerException
        method2(); //ClassCastException
        method3(); //NegativeArraySizeException
        method4(); //ArrayIndexOutOfBoundsException
    }
}
