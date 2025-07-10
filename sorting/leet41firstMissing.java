package sorting;

public class leet41firstMissing {

    public static void main(String[] args) {
        int []nums={1,2,0};
       int m = firsMissingNum(nums);
       System.out.println(m);

    }
    static int firsMissingNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // int correct = nums[i];
            
            int correct = nums[i] - 1;
            if (nums[i] > 0  && nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);

            } else {
                i++;
            }

        }

        // search for missing value
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return j+1;

            }
        }

        // case 2
        return nums.length+1;
    }
    static void swap(int[] nums, int fi, int sec) {
        int temp = nums[fi]; 
        nums[fi] = nums[sec];
        nums[sec] = temp;

    }
}
