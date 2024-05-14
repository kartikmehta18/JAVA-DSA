package lecture_7.practice;

import java.util.Scanner;

public class tillnu {

    public static void tillNum(int num) {
        for(int i=0;i<=num;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th num till u print");
        int num =sc.nextInt();
        System.out.println("num is");
        tillNum(num);
    }
}
