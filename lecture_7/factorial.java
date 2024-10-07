package lecture_7;

import java.util.Scanner;

public class factorial {
    //RECURSION
    // public static int factorialNum(int a){
    //     if(a == 1)
    //     {
    //         return 1;
    //     }
    //     else
    //     {
    //         return a*factorialNum(a-1);
    //     }
    
    // }

    public static void factorialNum(int a){
        if (a<0){
            System.out.println("invalid num");
            return;
        }
        int factoriall =1;
        for(int i=a;i>=1;i--){
          factoriall=factoriall*i;
        }
        System.out.println(factoriall);
      }
       
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of factorial u want");
         int a=sc.nextInt();
         factorialNum(a);
         
    }
}
