package lecture_9Array;

public class evenDig {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums)); // Corrected to use System.out.println
        System.out.println(digits(-6789));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofDigits = digits(num);
        return numberofDigits % 2 == 0; // Simplified return statement
    }

    static int digits(int num) {

        // val in negtive
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count; // Added return statement
    }
}
