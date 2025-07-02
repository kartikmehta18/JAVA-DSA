package lecture_9Array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 10 };
        reversee(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reversee(int[] arr) {
        int start = 0;
        int end = arr.length - 4;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}