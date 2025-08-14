package lecture15bit;

public class rangeXor {
    public static void main(String[] args) {
        // range xor
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        //only for check and time limit exceed
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);

    }

    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        if (a % 4 == 3) {
            return 0;
        }
        return 0;
    }
}