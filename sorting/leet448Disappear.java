package sorting;

import java.util.ArrayList;
import java.util.List;

// asked in google
public class leet448Disappear {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Missing numbers are: " + missingNum(nums));
    }

    static List<Integer> missingNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int fi, int sec) {
        int temp = nums[fi];
        nums[fi] = nums[sec];
        nums[sec] = temp;
    }
}
