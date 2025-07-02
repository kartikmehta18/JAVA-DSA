package searching.binary_interview;

public class leet34 {
    public static void main(String[] args) {
        int target = 8;
        int [] nums = {5, 7, 7, 8, 8, 10};
        int [] result = searchRange(nums, target);
        System.out.println("Start: " + result[0] + ", End: " + result[1]);
    }

    public static int [] searchRange(int[] nums , int target){
        int [] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }


// this function just returns the index of the first occurrence 
public static int search(int[] nums, int target, boolean findStartIndex){
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(target < nums[mid]){
            end = mid - 1;
        }else if(target > nums[mid]){
            start = mid + 1;
        }else{
            ans = mid;
            if(findStartIndex){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
    }
    return ans;
}

}
