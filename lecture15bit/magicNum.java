package lecture15bit;

public class magicNum {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int LAST = n & 1;
            n = n >> 1; //right shift 1 binary position
            ans += LAST * base;
            base = base * 5;

        }
        System.out.println(ans);
    }
}
