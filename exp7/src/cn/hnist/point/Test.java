package cn.hnist.point;

public class Test {
    public static void main(String[] args) {
        System.out.println("二维空间内 : ");
        System.out.print("\np2d1");
        Point2D p2d1 = new Point2D(1, 1);
        System.out.print("\np2d2");
        Point2D p2d2 = new Point2D(2, 3);
        System.out.print("\np2d1");
        p2d1.offset(1, 1);// p2d1点向上、向右分别平移一个单位
        System.out.print("\np2d2");
        p2d2.offset(2, -1);// p2d1点向下平移一个单位、向右平移两个单位
        distance(p2d1.getX(), p2d1.getY(), p2d2.getX(), p2d2.getY());

        System.out.println("三维空间内 : ");
        System.out.print("\np3d1");
        Point3D p3d1 = new Point3D(1, 1, 1);
        System.out.print("\np3d2");
        Point3D p3d2 = new Point3D(p2d2, 3);
        System.out.print("\np3d1");
        p3d1.offset(1, 1, 1);// p3d1点向x、y、z方向分别平移一个单位
        System.out.print("\np3d2");
        p3d2.offset(-1, -2, -3);// p3d1点分别向x、y、z反方向平移一个、两个、三个单位
        distance(p3d1.getX(), p3d1.getY(), p3d1.getZ(), p3d2.getX(), p3d2.getY(), p3d2.getZ());
    }

    public static void distance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(Math.abs((x1 - x2) * (x1 - x2) +
                (y1 - y2) * (y1 - y2)));
        System.out.println("\n两点的距离为：" + String.format("%.2f", d));
    }

    public static void distance(int x1, int y1, int z1, int x2, int y2, int z2) {
        double d = Math.sqrt(Math.abs((x1 - x2) * (x1 - x2) +
                (y1 - y2) * (y1 - y2) +
                (z1 - z2) * (z1 - z2)));
        System.out.println("\n两点的距离为：" + String.format("%.2f", d));
    }
}
