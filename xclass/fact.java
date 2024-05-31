package xclass;

import java.util.Scanner;

public class fact {
   
    public static void factorial(int f){
        int fac=1;
        for(int i=1;i<=f;i++){
           
            fac= fac+fac*i;
        }
        System.out.println(fac);
      
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th fact u want");
         int f =sc.nextInt();
        factorial(f);
}
}
