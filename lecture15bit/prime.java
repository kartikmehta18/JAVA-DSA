package lecture15bit;

public class prime {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {

                System.out.println(i + " " + isPrime(i)); // onlu prime
            }
            // System.out.println(i+ " "+ isPrime(i)); print prime and non

        }

    }

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
