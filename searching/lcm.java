package searching;

public class lcm {
    public static void main(String[] args) {
        int a = 9;
        int b = 18;
        System.out.println(gcdHcf(a, b));
        ;
        System.out.println(lcmn(a, b));
        ;

    }

    static int gcdHcf(int a, int b) {

        if (a == 0) {
            return b;
        }
        return gcdHcf(b % a, a);
    }

    static int lcmn(int a, int b) {
        return a * b / gcdHcf(a, b);
    }
}
