package sorting;

import java.util.Arrays;

public class mergesort {
    // public static void main(String[] args) {
    // int[] arr = { 5, 4, 3, 2, 1 };
    // arr = mergesortt(arr);
    // System.out.println(Arrays.toString(arr));
    // }

    // static int[] mergesortt(int[] arr) {
    // if (arr.length == 1) {
    // return arr;
    // }

    // int mid = arr.length / 2;

    // int[] left = mergesortt(Arrays.copyOfRange(arr, 0, mid));
    // int[] right = mergesortt(Arrays.copyOfRange(arr, mid, arr.length));
    // return merge(left, right);
    // }

    private static int[] merge(int[] first, int[] second) {
    int[] mix = new int[first.length + second.length];

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < first.length && j < second.length) {
    if (first[i] < second[j]) {
    mix[k] = first[i];
    i++;
    } else {
    mix[k] = second[j];
    j++;
    }
    k++;
    }

    // Copy the remaining elements
    while (i < first.length) {
    mix[k] = first[i];
    i++;
    k++;
    }
    // Corrected loop
    while (j < second.length) {
    mix[k] = second[j];
    j++;
    k++;
    }
    return mix;
    }
    
    // now mergesort inpla
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        mergesortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergesortInPlace(arr, s, mid);
        mergesortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s, j = mid, k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }
        while (i < mid) { // Only up to mid
            mix[k++] = arr[i++];
        }
        while (j < e) { // Only up to e
            mix[k++] = arr[j++];
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
