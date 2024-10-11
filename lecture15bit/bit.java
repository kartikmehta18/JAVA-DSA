package lecture15bit;

public class bit {
    public static void main(String[] args) {
        int n = 5; // Input number 0101
        int pos = 3; // Position of the bit to check (0-indexed)
        int bitmask = 1 << pos; // Create a bitmask with a 1 at the given position

        // Check if the bit at the given position is 0 or 1
        if ((bitmask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}
