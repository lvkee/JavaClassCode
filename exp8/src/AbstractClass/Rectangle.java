package AbstractClass;

public class Rectangle extends Geometric {
    int x;
    int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double findArea() {
        return x * y;
    }

    @Override
    public double findPerimeter() {
        return 2 * (x + y);
    }
}
