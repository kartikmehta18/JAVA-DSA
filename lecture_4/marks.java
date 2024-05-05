package lecture_4;

import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i; //= sc.nextInt();
        System.out.println("Enter the marks");
        do{
           int  m = sc.nextInt();
            if(m>=90 && m<=100){
                System.out.println("a grade");
            }else if(m>=60 && m<=89){
            System.out.println("b grade");
            }else if(m>=0 && m<=59){
             System.out.println("c grade");
            }else{
                System.out.println("invalid marks");
            }
            System.out.println("Want to continue ? (yes(1) or no(0))");
            i = sc.nextInt();
        }while(i==1);
    }
}
