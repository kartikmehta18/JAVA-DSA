package lecture_9Array;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();

        int number[] =new int [size];
        //ip
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            System.out.print(number[i]);
        }

        //for each loop

        for(int numm :number){
            System.out.println(num+ ' ');
        }
    }
}
