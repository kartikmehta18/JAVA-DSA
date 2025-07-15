package searching.binary_interview;


public class leet744 {

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // target = sc.nextLine();
        char target = 'a';
        char [] letters={'a','c','d'};
       char ans= nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
   
        return letters[start % letters.length];
    }
}
