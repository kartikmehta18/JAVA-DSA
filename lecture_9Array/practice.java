package lecture_9Array;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();

        int number[] =new int [size];
        //ip
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("x found index:");
        //op
        int x=sc.nextInt();
       
        for(int i=0;i<number.length;i++){
            if(number[i] == x){
            System.out.println("x found at index:"+i);
            }
        }
    }
}
