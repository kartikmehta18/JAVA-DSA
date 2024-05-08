package lecture_6;

import java.util.Scanner;

public class mul {
    public static int multiplyNum (int a, int b){
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        System.out.println("product 5"+ multiplyNum(a, b));
    }
}
