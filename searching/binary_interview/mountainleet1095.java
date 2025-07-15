
package searching.binary_interview;

public class mountainleet1095 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;
        int result = search(arr, target);
        System.out.println("Index of target: " + result);
    }

    // Main search function
    static int search(int[] arr, int target) {
        int peak = findPeakIndex(arr);
        int firstTry = binarySearch(arr, target, 0, peak, true);

        if (firstTry != -1) {
            return firstTry;
        }
        // Try in the descending part
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    // Find peak index in mountain array
    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in the descending part
                end = mid;
            } else {
                // You are in the ascending part
                start = mid + 1;
            }
        }
        return start; // or return end; both are same
    }

    // Binary search with ascending/descending control
    static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // not found
    }
}
