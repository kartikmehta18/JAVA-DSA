package lecture_9Array;

public class searchInrange {
    public static void main(String[] args) {
        int[] arr ={18,12,-7,3,14,28};
        int target = 3;
        System.out.println(linearSearch(arr, target,1,4));
    }

    static int linearSearch(int[ ]arr, int traget, int start , int end){
        if (arr.length == 0) {
            return -1;
        }

        for(int i=start; i <=end;i++ ){
            int element = arr[i];
            if (traget==element) {
                return i;
            }

        }
        return -1;
    }
}
