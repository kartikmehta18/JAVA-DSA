package searching.binary_interview;

public class leet852peak {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        int ans = peak(arr);
        System.out.println(ans);
    }

    public static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // System.out.println(arr.length);
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }
}
