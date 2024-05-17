package lecture_9Array;

import java.util.Scanner;



public class uginput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of arr");
        int size =sc.nextInt();
       
        String names[]= new String[size];
        System.out.println("enter the names in arr");
        for(int i=0;i<size;i++){
            names[i] =sc.next();
        }
        System.out.println("entered names in arr is");
        //print
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
