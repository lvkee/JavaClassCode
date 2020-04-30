package AbstractClass;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        Rectangle r = new Rectangle(2, 3);
        System.out.println("半径为2的圆c面积为" + String.format("%.2f",c.findArea()) +
                ",周长为" + String.format("%.2f",c.findPerimeter()));
        System.out.println("长为2、宽为3的长方形r的面积为" + r.findArea() +
                ",周长为" + r.findPerimeter());
    }
}
