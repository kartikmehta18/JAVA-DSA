package sorting;


public class leet287Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = findDupli(nums); // capture the result
        System.out.println("Duplicate number is: " + duplicate);
    }

    public static int findDupli(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i]; // duplicate found
                }
            } else {
                i++;
            }
        }
        return -1; // no duplicate found
    }

    static void swap(int[] nums, int fi, int sec) {
        int temp = nums[fi];
        nums[fi] = nums[sec];
        nums[sec] = temp;
    }
}
