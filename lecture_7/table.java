package lecture_7;

import java.util.Scanner;

public class table {

    public static void tableNum(int n){
        for(int i=1;i<=10;i++){
            int mul=i*n;
            System.out.println(n+"*"+i+"="+mul);
        }
       
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number table u want");
        int n= sc.nextInt();
        tableNum(n);
    }
}
