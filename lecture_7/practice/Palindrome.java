package lecture_7.practice;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int n) {
        int reversed = 0;
        int original = n;

        while (n > 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }

        return original == reversed;
    }
}