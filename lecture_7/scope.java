package lecture_7;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(marks);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(marks);
    }
}

// public class scope {
// public static void main(String[] args) {
// int a = 10;
// int b = 20;
// {
// a = 78;
// int c = 99;
// // values initialised in this block, will remail in block
// }
// System.out.println(c);
// }

// static void random(int marks) {
// int num = 67;
// System.out.println(num);
// System.out.println(marks);
// }
// }

// public class Scope {
//     public static void main(String[] args) {
//     int a = 10;
//     int b = 20;
//     {
//     // int a = 78; // already initialised outside the block in the same
//     a = 100; // reassign the origin ref variable to some other value
//     System.out.println(a);
//     int c = 99;
//     // values initialised in this block, will remain in block
//     }
//     System.out.println(a);
//     // System.out.println(c); // cannot use outside the block
//     static void random(int marks) {
//     int num = 67;
//     System.out.println(num);
//     System.out.println(marks);
//     }
// }
// }