package lecture_3;

import java.util.Scanner;

public class switchs {
    public static void main (String[] args){
        System.out.println("selects num 1,2,3");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
                case 1:
                System.out.println("Jai jinendra");
                break;

                case 2:
                System.out.println("hello");
                break;  
                
                case 3:
                System.out.println("bonjur");
                break;  
        
            default:
            System.out.println("not a valid ");
                break;
        }
    }
}
