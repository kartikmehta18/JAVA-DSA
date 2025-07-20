package recursion;

public class faborec {
    public static void main(String[] args) {

        System.out.println(fabofor(50));
        // System.out.println(fab(6));
    }

    static int fab(int n) {
        if (n < 2) {
            return n;
        }
        return fab(n - 1) + fab(n - 2);
    }

    static int fabofor(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
