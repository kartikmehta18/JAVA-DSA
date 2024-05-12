package lecture_5;

public class butterfly {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=n;i++){
             //1nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space 
            int space =2*(n-i);
            for(int j=1;j<=space;j++){
            System.out.print(" ");
            }

            //2nd part

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
  
        for (int i=n;i>=1;i--){
            //1nd part
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           //space
           int space =2*(n-i);
           for(int j=1;j<=space;j++){
           System.out.print(" ");
           }

           //2nd part

           for(int j=1; j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}
