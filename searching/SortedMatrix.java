package searching;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    static int[] binarysearch(int[] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart  <=cEnd) {
            int mid=cStart +(cEnd-cStart)/2;
            if (matrix[row][mid]== traget) {
                return int [] {row,mid};
            }
            if (matrix[row][mid] < traget) {
                 cStart=  mid+1 ;
             
            }else{
                 cEnd= mid-1;
            }
        }
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;

        if (row == 1) {
            return binarysearch(matrix,0,0, cols-1, target)
        }
        int rStart =0;
        int rEnd= row-1;
        int cMid = cols/2


        while (rStart< (rEnd -1)) {
            int mid =rStart +(rwnd=rStart)/2
            if(matrix[mid][cMid]== target){
                return new int [] {mid,cmid};
            }
        }
    }
}
