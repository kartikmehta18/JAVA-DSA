package lecture15bit;

public class odd {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1 ;
    }
}
