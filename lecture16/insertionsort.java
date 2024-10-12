package lecture16;

public class insertionsort {
    public static void printArray(int arr[]) {
        System.out.println("sorted  array is this:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // time complexity =
        // insertion

        for (int i = 1; i < arr.length; i++) {
        int current = arr[i];
        int j=i-1;
        while(j>= 0 && current < arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        //placement
        arr[j-1] = current;

        }
        printArray(arr);
    }
}
