package recursion;

public class product {

    public static void main(String[] args) {
        // Expected output: 1 * 3 * 4 * 2 = 24
        System.out.println(prod(1342));
    }

    static int prod(int n) {
        // Base Case: If n is a single-digit number, return it.
        // This stops the recursion.
        if (n / 10 == 0) { // You can also use (n < 10 )
            return n;
        }

        // Recursive Step: Multiply the last digit (n % 10) by the
        // product of the remaining digits (prod(n / 10)).
        return (n % 10) * prod(n / 10);
    }
}