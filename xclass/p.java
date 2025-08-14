package xclass;

import java.util.Arrays;

public class p {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 9, 1 };
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Count of minimum operations is " + pal(arr));
    }

    public static int pal(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int ans = 0;

        while (i <= j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] > arr[j]) {
                j--;
                arr[j] = arr[j] + arr[j + 1];

                ans++;
            } else {
                i++;
                arr[i] += arr[i - 1];
                ans++;
            }
        }

        return ans;
    }
}
