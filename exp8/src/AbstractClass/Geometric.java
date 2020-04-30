package AbstractClass;
// exp8:Geometric.java

public abstract class Geometric {
    protected String color;

    public Geometric() {
    }

    public Geometric(String color) {
        this.color = color;
    }

    public abstract double findArea();

    public abstract double findPerimeter();

}
