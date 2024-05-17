package lecture_9Array;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int size = sc.nextInt();
        int num[] = new int [size];
        System.out.println("Enter the num");
        //input 
        for(int i=0;i<size;i++){
            num[i]= sc.nextInt();
        }

        

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<num.length; i++) {
           if(num[i] < min) {
               min = num[i];
           }
           if(num[i] > max) {
               max = num[i];
           }
       }


       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);


    }
}
