package lecture_3;
import java.util.*;
import java.util.Scanner;
public class calcu {
    public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("select operation\n 1 add\n 2 sub\n 3 mul \n 4 div\n ");
    int n= sc.nextInt();
    System.out.println("enter the value of A , B");
    int a= sc.nextInt();
    int b= sc.nextInt();
    
    switch (n) {
            case 1:
            int sum = a+b;
            System.out.println(sum);
            break;
            case 2:
            int sub = a-b;
            System.out.println(sub);
            break;
            case 3:
            int mul= a*b;
            System.out.println(mul);
            break;
            case 4:
            int div = a/b;
            System.out.println(div);
            break;
    
        default: System.out.println("Invalid Command");
            break;
         }

    }
}
