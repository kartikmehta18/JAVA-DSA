package lecture_3;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x%2==0){
            System.out.println(x+ " "+"is an even number");
        }else{
            System.out.println(x+" "+"is an odd number");
        }

    }
}
