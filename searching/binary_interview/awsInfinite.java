package searching.binary_interview;

public class awsInfinite {
    public static void main(String[] args) {

    }

    static int ans(int[] arr, int target) {
        // first we find the range
        int start = 0;
        int end = 1;

        // condition for the target lie in the range
        while ( target > arr[mid]) {
            int newStart= end+1
            int
            
        }

    }

    static int binarySearch(int[] arr, int target, int start) {

        while (start <= end) {
            int mid = (start + end) / 2;
            // int mid = start+(end-start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
