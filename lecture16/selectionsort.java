package lecture16;

public class selectionsort {

    public static void printArray(int arr[]){
        System.out.println("sorted  array is this:");
        for(int i=0 ; i< arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // time complexity =O(n^2)
        // selection

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
