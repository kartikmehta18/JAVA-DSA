package searching;

public class newtonSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) return 0.0;

        // sensible initial guess avoids division by zero
        double x = n;
        double root = x;
        // convergence tolerance
        // double eps = 1e-6;

        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 1) {
                break;
            }
            x = root;
        }
        return root;
    }
}
