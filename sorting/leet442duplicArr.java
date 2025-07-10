package sorting;

import java.util.ArrayList;
import java.util.List;

public class leet442duplicArr {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(duparr(nums));

    }

    static List<Integer> duparr(int[] nums) {
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
            if (nums[j] != j + 1) { //0,1,2,3,4,5,6,7
                ans.add(nums[j]);// 1,2,3,4,3,2,7,8

            }
        }
        return ans;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
