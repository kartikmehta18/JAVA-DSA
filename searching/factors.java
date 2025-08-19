package searching;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        factor2(20);

    }

    static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    static void factor1(int n) {

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {

                    System.out.println(i + " ");
                } else {

                    System.out.println(i + " " + n / i + " ");
                }
            }
        }
    }

    // PRINT IN SORT
    static void factor2(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {

                    System.out.println(i + " ");
                } else {

                    System.out.println(i + " " + " ");     
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + "");
        }
    }
}
