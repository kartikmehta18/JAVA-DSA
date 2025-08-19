package recursion;

public class nto1 {
    public static void main(String[] args) {
        funREV(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    
    }
    static void funREV(int n) {
        if (n == 0) {
            return;
        }
        funREV(n - 1);
        System.out.println(n);
    
    }
}
