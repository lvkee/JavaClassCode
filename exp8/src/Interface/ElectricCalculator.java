package Interface;

public class ElectricCalculator extends Calable {
    int x;
    int y;

    public ElectricCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ElectricCalculator(int x) {
        this.x = x;
    }

    @Override
    public double add() {
        return x + y;
    }

    @Override
    public double reduce() {
        return x - y;
    }

    @Override
    public double multiple() {
        return x * y;
    }

    @Override
    public double divide() {
        return x / y;
    }

    @Override
    public double residue() {
        return x % y;
    }

    @Override
    public double factorial() {
        int ans = 1;
        while (x >= 1) {
            ans *= x;
            x--;
        }
        return ans;
    }
}
