package recursion;

public class binaryrec {
    public static void main(String[] args) {
        int[] arr = { 4, 235, 6, 41, 2 };
        int k = search(arr, 6, 0, arr.length - 1);
        System.out.println(k);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + e / 2;
        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        } else {
            return search(arr, target, s, m + 1);
        }
    }
}
