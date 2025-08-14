package lecture16;

import java.util.Scanner;

class bubblesort {
    public static void printArr(int arr[]) {
        System.out.println("sorted  array is this:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // int arr[] = { 7, 8, 3, 1, 2 };
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // bubblesort

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

        printArr(arr);
    }
}
