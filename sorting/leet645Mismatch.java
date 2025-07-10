package sorting;

import java.util.Arrays;

public class leet645Mismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] m = mismatch(nums);
        System.out.println(Arrays.toString(m));
    }

    static int[] mismatch(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1}; // {duplicate, missing}
            } 
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] nums, int fi, int sec) {
        int temp = nums[fi];
        nums[fi] = nums[sec];
        nums[sec] = temp;
    }
}
