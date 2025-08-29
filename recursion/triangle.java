package recursion;

public class triangle {
    public static void main(String[] args) {
triangl(4,0);
triangl1(4,0);
    }

    static void triangl(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangl(r, c + 1);
        } else {
            System.out.println();
            triangl(r - 1, 0);
        }
    }
    static void triangl1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangl1(r, c + 1);
            System.out.print("*");
        } else {
            triangl1(r - 1, 0);
            System.out.println();
        }
    }
}
