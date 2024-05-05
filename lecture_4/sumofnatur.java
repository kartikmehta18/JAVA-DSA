package lecture_4;

import java.util.Scanner;

public class sumofnatur {
    public static void main(String[] args){
        System.out.println("Enter the num");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           
            int sum=0;

            for( int i=0;i<=n;i++){
                sum= sum+i;
            }
            System.out.println(sum);


    }
}
