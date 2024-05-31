package xclass;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int [] marks = new int [3] ;
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the arr index");
        int in =sc.nextInt();
        System.out.println("enter the number for divide");
        int number =sc.nextInt();
        try{
            System.out.println("The value of aarr index enterd id:"+marks[in]);
            System.out.println("the value of "+marks[in]+"/"+number+"is"+" "+marks[in]/number );

        }
        catch(Exception e){
            System.out.println("some acception occur!");
            System.out.println(e);
        }
    }
}
