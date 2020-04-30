package AbstractClass;

public class Circle extends Geometric {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double findArea() {
        return r * r * Math.PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * r * Math.PI;
    }
}
