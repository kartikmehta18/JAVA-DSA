package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        // List<List<Integer>> ans = subset(arr);
        List<List<Integer>> ans = subsetDupList(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetDupList(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(arr); // ✅ sort first

        outer.add(new ArrayList<>());
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current element is same as previous, only add to subsets
            // created in previous step
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1; // ✅ update after check

            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]); // ✅ add element, not index
                outer.add(internal);
            }
        }

        return outer;
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }
}
