package lecture_9Array;

public class max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 23, 99, 18 };
        System.out.println(maxx(arr));
        System.out.println(maxxRange(arr, 1, 3));
    }

    /// simgle max value
    static int maxx(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    /// simgle max value till range
    static int maxxRange(int[] arr, int start, int end) {
        // if (end > start) {
        //     return -1;
        // }
        // if (arr == null) {
        //     return -1;
        // }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
