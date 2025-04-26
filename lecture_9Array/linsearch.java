package lecture_9Array;

public class linsearch {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 2, 1, 8, 78, -1, 16, 19 };
        int target = 45;
        // int ans = linearSearch(nums, target);
        int ans = linearSearch1(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return 0;
    }
    static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return target;
            }
        }
        return 0;
    }
}
