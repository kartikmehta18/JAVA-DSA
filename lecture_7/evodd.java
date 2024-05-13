package lecture_7;

import java.util.Scanner;

public class evodd {
     public static void evenOdd(int n){
        if(n%2==0){
            System.out.println(n+" "+"is even  number");
        }else{
            System.out.println(n+" "+"is odd  number");
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number find wether it is even or odd");
        int n= sc.nextInt();
        evenOdd(n);
    }
}
