package Interface;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int x = 16;
        int y = 88;
        ElectricCalculator a = new ElectricCalculator(x, y);
        ElectricCalculator red = new ElectricCalculator(x, y);
        ElectricCalculator m = new ElectricCalculator(x, y);
        ElectricCalculator d = new ElectricCalculator(x, y);
        ElectricCalculator res = new ElectricCalculator(x, y);
        ElectricCalculator fac = new ElectricCalculator(x);
        System.out.println(x + "+" + y + "=" + String.format("%.2f", a.add()));
        System.out.println(x + "-" + y + "=" + String.format("%.2f", a.reduce()));
        System.out.println(x + "*" + y + "=" + String.format("%.2f", a.multiple()));
        System.out.println(x + "/" + y + "=" + String.format("%.2f", a.divide()));
        System.out.println(x + "%" + y + "=" + String.format("%.2f", a.residue()));
        System.out.println(x + "的阶乘等于" + String.format("%.2f", a.factorial()));
    }
}
