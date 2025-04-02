package lecture_7;

import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean and = isPrime(n);
        System.out.println(and);

        System.out.println("arm " + isArm(n));

        // for(int i=100; i<1000; i++){
        // if(isArm(i)){
        // System.out.println(i +"");
        // }
        // }
    }

    // digit armstrong
    static boolean isArm(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;

        while (c * c <= c) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        }
        return false;
    }
}
