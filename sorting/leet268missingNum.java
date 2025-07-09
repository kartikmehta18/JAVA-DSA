package sorting;

public class leet268missingNum {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int missing = missingNum(arr); // store returned value
        System.out.println("Missing number is: " + missing);

    }

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);

            } else {
                i++;
            }

        }

        // search for missing value
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;

            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int fi, int sec) {
        int temp = arr[fi]; 
        arr[fi] = arr[sec];
        arr[sec] = temp;

    }
}
