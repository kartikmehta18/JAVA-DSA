package recursion;

public class sum {
    public static void main(String[] args) {
        System.out.println(summ(5));
    }

    static int summ(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + summ(n - 1);
    }
}
