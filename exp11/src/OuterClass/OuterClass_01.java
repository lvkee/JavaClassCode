package OuterClass;

/**
 * 1. 定义一个类A，它有一个内部类B.
 * 2. 定义B的方法g，它访问A的数据成员。
 * 3. 定义A的方法f，它访问B的数据成员，注意必须指明那个内部类对象的数据成员。
 * 4. 确保类A有方法修改A的域。
 * 5. 确保类B有方法print，输出A的域。
 * 6. 定义类C，它只有一个main方法。在main方法体内创建A类对象a。a作为外围对象创建B类对象b；
 * 7. 验证：每个内部类对象，都有一个相关联的外部类对象，就是创建它的外部类对象。
 * 方法：首先对象b调用print，打印a的域，然后修改a的域，最后b再次调用print，打印a的域，打印结果应该与对a的修改一致，从而说明b与a相关联。
 */
class A {
    private static int index = 100;

    class B {
        private int index = 10;

        void g(int index) {
            A.this.index = index;  // 访问A中的成员变量
        }

        void print() {
            System.out.println("B中成员变量index:" + index);
            System.out.println("A中成员变量index:" + A.this.index);
        }
    }

    void f(int index) {
        B b = new B();
        b.index = index; // 访问B中的成员变量
    }
}

public class OuterClass_01 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = new A().new B();
//        System.out.println(b);
        b.print();
        System.out.println("----修改后----");
//        a.f(70);
        b.g(70);
        b.print();
    }
}
