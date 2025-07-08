package sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = { 2,-1,100,45,10000};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            // Swap the found maximum element with the last element
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}