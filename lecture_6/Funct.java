package lecture_6;

import java.util.Scanner;

public class Funct {
    public static void printName(String name){
        System.out.println(name);
    }

    public static void main(String args[])
{   Scanner sc =new Scanner(System.in);
    String name =sc.next();
    printName(name);
}

}
