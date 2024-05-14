package lecture_7.practice;
import java.util.Scanner;
public class twonum 

 {
    public static void greaterNum(int a, int b){
           if(a>b){
            System.out.println(a+"a greater");
           }else{
            System.out.println(b+" b greater");
           }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A ,B ");
        int a = sc.nextInt();
        int b = sc.nextInt();
       
       greaterNum(a, b);
    }
}


