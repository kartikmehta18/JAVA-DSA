package lecture_7.practice;

import java.util.Scanner;

public class circle {
    public static void circumference(int r){
      
        double cir= 2*3.14*r;
        System.out.println("circumference of a circle is:"+cir);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius ");
        int r = sc.nextInt();
        
       
       circumference(r);
    }
}
