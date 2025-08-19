package lecture15bit;

public class seivepr {
    public static void main(String[] args) {
        int n = 40;  
        boolean[] prime = new boolean[n + 1];
        seieve(n, prime);
    }

    static void seieve(int n, boolean[] prime) {

        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                    // System.out.println(j);

                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.println(i + " ");
            }
        }
    }
}
