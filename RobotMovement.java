import java.util.Arrays;

public class RobotMovement {

   
    public static int[] finalCoordinates(String directions) {
        int x = 0, y = 0;
        int i = 0;

        while (i < directions.length()) {
            char dir = directions.charAt(i); // Get direction character
            i++;

            // Extract the full number (can be multi-digit)
            int steps = 0;
            while (i < directions.length() && Character.isDigit(directions.charAt(i))) {
                steps = steps * 10 + (directions.charAt(i) - '0');
                i++;
            }

            // Update coordinates based on direction
            if (dir == 'n') y += steps;
            else if (dir == 's') y -= steps;
            else if (dir == 'e') x += steps;
            else if (dir == 'w') x -= steps;
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        String directions = "n1s2w3e4";
        int[] result = finalCoordinates(directions);
        System.out.println("Final Coordinates: " + Arrays.toString(result)); 
        // Example Output: Final Coordinates: [1, -1]
    }
}
