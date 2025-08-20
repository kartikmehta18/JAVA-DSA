package recursion;

public class fact {
    public static void main(String[] args) {
        long ans = fac(20);
        System.out.println(ans);

    }

    static long fac(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

}
