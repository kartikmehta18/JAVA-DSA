package lecture_7;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        // sum();
        swap();
    }

    public static void sum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int a = sc.nextInt();
        System.out.println("enter num2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

    }

    public static int swap() {
        int c = 10;
        int d = 19;
        System.out.println(c + " " + d);
        int temp = c;
        c = d;
        d = temp;
        System.out.println("by swaping " + c + " " + d);
        return 0;
    }

}
