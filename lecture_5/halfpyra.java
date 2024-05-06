// package lecture_5;

// public class halfpyra {
//     public static void main(String[] args){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
       
//     }
// }

//invert
// package lecture_5;

// public class halfpyra {
//     public static void main(String[] args){
//         for(int i=4;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
       
//     }
// }


//invert by 180
package lecture_5;

public class halfpyra {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1 ;j<=i ;j++){
            System.out.print("*");
            }
            System.out.println();
        }
       
    }
}

