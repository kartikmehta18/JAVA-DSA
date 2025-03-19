// package lecture_5;

// import java.util.Scanner;

// public class numpyr {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the num till pyramid u  want");
//         int n =sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println( );
//         }


//     }
// }

// reverse

package lecture_5;

import java.util.Scanner;

public class numpyr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num till pyramid u  want");
        int n =sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }


    }
}
