package xclass;

public class MatrixMultiplication {

    // Function to multiply two 3x3 matrices
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[3][3]; // Resultant matrix will be 3x3

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return result;
    }

    // Function to display a 3x3 matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] secondMatrix = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        System.out.println("First Matrix:");
        displayMatrix(firstMatrix);

        System.out.println("Second Matrix:");
        displayMatrix(secondMatrix);

        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        System.out.println("Result of Matrix Multiplication:");
        displayMatrix(resultMatrix);
    }
}
