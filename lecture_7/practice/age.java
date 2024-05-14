package lecture_7.practice;

import java.util.Scanner;


    public class age {
    public static void ageNum(int a){
            if(a<18){
               System.out.println("you are not eligable for vote ");
            }else{
                System.out.println("you are  eligable for vote ");
            }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your Age: ");
            int a = sc.nextInt();
                                                                  
            ageNum(a);
        }
    }
}
                 