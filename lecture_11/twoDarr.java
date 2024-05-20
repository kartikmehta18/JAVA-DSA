package lecture_11;

import java.util.Scanner;

public class twoDarr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows n column");
        int rows =sc.nextInt();
        int cols =sc.nextInt();

        int [][] numbers = new int[rows] [cols];

        //input
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }

        //op
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
               System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
