

import java.util.Arrays;

public class palin {

  
    public static int findMinOps(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int i = 0, j = n - 1;

        while (i <= j) {
            // If elements at both ends are the same, they form a palindrome.
            // Move the pointers inward.
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } 
            // If the left element is greater than the right one,
            // merge the element at j with its neighbor to the right.
            else if (arr[i] > arr[j]) {
                j--;
                arr[j] += arr[j + 1];
                ans++;
            } 
            // If the right element is greater than the left one,
            // merge the element at i with its neighbor to the left.
            else { // arr[i] < arr[j]
                i++;
                arr[i] += arr[i - 1];
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Count of minimum operations is " + findMinOps(arr));
    }
}
