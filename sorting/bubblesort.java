package sorting;

import java.util.Arrays;

//also knowns as sinking sort and exchange sort O(N)  worst-> O(N^2) 
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5 };
        bubble(arr);
        // System.out.println(sort);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 time
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step , max item will come at the last repeatative index
            for (int j = 1; j < arr.length -i - 1; j++) {
                // sawap if the items is smaller than the previous iteam

                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
