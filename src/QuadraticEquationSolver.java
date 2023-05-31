public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        int dis = b * b - 4 * a * c;
        if (dis > 0) {
            double x1, x2;
            x1 = -b - Math.sqrt(dis) / (2 * a);
            x2 = -b + Math.sqrt(dis) / (2 * a);
            if (x1 > x2) {
                return new double[]{x1, x2};
            }
            if (x2 > x1) {
                return new double[]{x2, x1};
            }
        } else if (dis == 0) {
            double x1;
            x1 = -b / (2 * a);
            return new double[]{x1};
        }
        return new double[0];

    }
}