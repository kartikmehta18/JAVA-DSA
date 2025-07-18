package lecture_5.pattern;

public class p1 {
    public static void main(String[] args) {
        pattern9(4);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                // for(int j=n; j >=i; j--){

                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // for(int j=n; j >=i; j--){

                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int tc = i > n ? 2 * n - i : i;
            for (int j = 1; j <= tc; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern6(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int tc = i > n ? 2 * n - i : i;

            int noOfSpace = n - tc;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < tc; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {

            // space
            for (int s = 0; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(" ");
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int tc = i > n ? 2 * n - i : i;
            // space
            for (int s = 0; s < n - tc; s++) {
                System.out.print("  ");
            }

            for (int j = tc; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= tc; j++) {
                System.out.print(j + " ");
            }

            System.out.println(" ");
        }
    }

    static void pattern9(int n) {
        int on = n;
        n = 2 * n;
        for (int i = 0 ; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int everyidx = on - Math.min(Math.min(j, i), Math.min(n - i, n - j));
                System.out.print(everyidx + " ");
            }
            System.out.println();
        }
    }
}
