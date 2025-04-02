package lecture_7;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(2, 3, 4, 45, 6);  // calls the fun method with multiple integers
        multiple(1, 2, "kartik", "shubh");  // calls the multiple method with integers and strings
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));  // prints the array of integers
    }

    static void multiple(int a, int b, String... v) {
        // print integers a and b
        System.out.println("Integers: " + a + ", " + b);
        
        // print the array of strings passed as varargs
        System.out.println("Strings: " + Arrays.toString(v));
    }
}
