package InnerClass;
/**
 * 在Outer类中增加一个getlnner ()方法(返回类型为Inner的对象);
 * 并更改main方法如下，编译并更改错误。
 */
/*class Outer {
    private static int index = 100;
    class Inner {
        private int index = 50;
        void print() {
            int index = 30;
            System.out.println(index);
            System.out.println(this.index);
            System.out.println(Outer.this.index);
        }
    }
    void print() {
        Inner i = new Inner();
        i.print();
    }
    Inner getInner() {
        return new Inner();
    }
}

public class InnerClass_03 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.getInner();
        inner.print();
    }
}*/
