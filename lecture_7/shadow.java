package lecture_7;

public class shadow {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);// scop begin when value initilized
        int x = 40;
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
