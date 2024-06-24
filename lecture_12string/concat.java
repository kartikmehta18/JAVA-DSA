package lecture_12string;

import java.util.Scanner;

public class concat {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
        System.out.println("entr your name and lastname");
        String name =sc.next(); //singel word
        String name1 =sc.next(); // whoel line
        String fullName = name+" "+name1;
        System.out.println(fullName);
        int str = fullName.length();
        System.out.println(str);
        for(int i=0; i<fullName.length();i++){

        System.out.println(fullName.charAt(i));
         }// print char at index
// now for comparing two name
System.out.println("Enter 2 name for comparew");
String name2 =sc.next();
String name3 =sc.next();
            // if (name2.compareTo(name3)==0){
            //     System.out.println("strings are equal");
            // }else{
            //     System.out.println("string not equal");
            // }
            //OR
            if (name2 == name3){
                System.out.println("strings are equal");
            }else{
                System.out.println("string are not equal");
            }
       String k= fullName.substring(3); //parsing
System.out.println(k);
    }
}
