package lecture_7;

import java.util.Scanner;

public class sum {
    public static int sumNum(int a , int b){
        int sum= a+b;
      return sum;

    }

      public static void main(String args[]){ 
     Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=  sumNum(a,b);
System.out.println("sum of a and b is"+sum);
   
}
}
