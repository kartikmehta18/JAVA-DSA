package lecture_7;

import java.util.Scanner;

public class factorial {

    public static int factorialNum(int a){
        if(a == 1)
        {
            return 1;
        }
        else
        {
            return a*factorialNum(a-1);
        }
    
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of factorial u want");
         int a=sc.nextInt();
         System.out.println(factorialNum(a));
    }
}
