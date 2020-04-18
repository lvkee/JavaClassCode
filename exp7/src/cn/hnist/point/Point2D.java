package cn.hnist.point;

public class Point2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    Point2D() {
    }

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.print("点的坐标为：[" + x + "][" + y + "]");
    }

    public void offset(int a, int b) {
        this.x += a;
        this.y += b;
        System.out.print("点平移后的坐标为：[" + x + "][" + y + "]");
    }
}
