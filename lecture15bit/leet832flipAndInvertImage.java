package lecture15bit;

import java.util.Arrays;

public class leet832flipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };
        int[][] ans = flipAndInvertImage(image);

        // Print the 2D array properly
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
        // Or alternatively:
        // System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // reverse
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;

            }

        }
        return image;

    }

}
