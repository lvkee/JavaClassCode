package cn.hnist.point;

import org.jetbrains.annotations.NotNull;

public class Point3D extends Point2D {
    private int z;

    public int getZ() {
        return z;
    }

    Point3D() {
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.print("[" + z + "]");
    }

    Point3D(@NotNull Point2D p, int z) {
        super(p.getX(), p.getY());
        this.z = z;
        System.out.println("[" + z + "]");
    }

    // 平移
    public void offset(int x, int y, int z) {
        super.offset(x, y);
        this.z += z;
        System.out.println("[" + this.z + "]");
    }

    public void offset(Point2D p, int z) {
        super.offset(p.getX(), p.getY());
        this.z += z;
        System.out.println("[" + z + "]");
    }
}
