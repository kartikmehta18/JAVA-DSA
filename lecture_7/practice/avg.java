package lecture_7.practice;

import java.util.Scanner;

public class avg {
    public static void avgNum(int a, int b, int c){
            int avga=(a+b+c)/3;
            System.out.println(avga);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A ,B ,C");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avgNum(a, b,c);
    }
}
