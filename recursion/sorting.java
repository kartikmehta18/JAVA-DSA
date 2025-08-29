package recursion;



public class sorting {
    public static void main(String[] args) {
        int []arr={1,2,3,15,6,8};
        System.out.println(sort(arr,0));
    }

    static boolean sort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && sort(arr, i + 1);
    }
}
