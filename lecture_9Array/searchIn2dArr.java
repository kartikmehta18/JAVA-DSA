package lecture_9Array;

import java.util.Arrays;

public class searchIn2dArr {

    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 },
        };
        int target = 4;
        // int[] ans = search(arr, target);
        int[] ans = max(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] max(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int []i :arr) {
            for (int j :i ) {
                if (j>max) {
                    max= j;
                }
            }
        }
        return max;
    }
}