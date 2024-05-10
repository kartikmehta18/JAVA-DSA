package xclass;

import java.util.Scanner;

public class Angastrom {

    public static void Angastrom(int num){
        int res =0;
        int n,r;
        for(int i=1;i<=num;i++){
            n=i;
            res=0;
            while (n!=0) {
                r=n%10;
                res=res*10+r*r*r;
                n=n/10;
            }
            if (i==res){
                System.out.println(i+" ");
            }

        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till Angastrom number you want");
        int num = sc.nextInt();
        Angastrom(num);
    }
}
