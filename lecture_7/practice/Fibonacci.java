package lecture_7.practice;

import java.util.Scanner;

public class Fibonacci {

    public static void fibon(int n){
        int num1 = 0, num2 = 1;

        for (int i = 0; i < n; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        fibon(n);
    }
}
