package lecture_11;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        
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
        System.out.println("Enter the num you want to search");
        int num = sc.nextInt();
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++){
                if(numbers[i][j] == num){
                    System.out.println("num found at locstion"+"("+i+", "+j+")");
                }
            }
        }
        sc.close();
    }
 }



// package lecture_11;

// import java.util.Scanner;

// public class practise {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the rows n column");
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols];

//         // Input
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter the num you want to search");
//         int num = sc.nextInt();
        
//         boolean found = false;
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (numbers[i][j] == num) {
//                     System.out.println("num found at location (" + i + ", " + j + ")");
//                     found = true;
//                 }
//             }
//         }
        
//         if (!found) {
//             System.out.println("num not found in the array");
//         }

//         sc.close();
//     }
// }
