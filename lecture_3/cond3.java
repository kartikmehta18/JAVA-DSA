package lecture_3;

import java.util.Scanner;

public class cond3 {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the val of a , b");
        int a = sc.nextInt();
        int b = sc.nextInt();

           if(a==b){
            System.out.println("Equal");
           }else{if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("b is greater");
            }
           
        }
    }
}
