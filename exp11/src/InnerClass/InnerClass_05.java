package InnerClass;
/**
 * 在Outer类中，添加方法fn()，并将Inner类放入，编译查看错误。
 */
class Outer {
    private static int index = 100;
    void fn() {
        class Inner {
            private int index = 50;
            void print() {
                int index = 30;
                System.out.println(index);
                System.out.println(this.index);
                System.out.println(Outer.this.index);
            }
        }
        Inner i = new Inner();
        i.print();
    }
}

public class InnerClass_05 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.fn();
    }
}
