package InnerClass;
/**
 * 用new Inner()来代替getInner()的方法，编译并更改错误
 */
/*
class Outer {
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

public class InnerClass_04 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = new Outer().new Inner();
        oi.print();
//        inner.print();
    }
}
*/
