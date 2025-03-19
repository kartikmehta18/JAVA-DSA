import java.util.Scanner;

public class WeatherStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] temperatures = new int[N];
        
        // Reading input temperatures
        for (int i = 0; i < N; i++) {
            temperatures[i] = sc.nextInt();
        }
        
        // Process missing values (-1) by replacing with the average of nearest valid neighbors
        for (int i = 0; i < N; i++) {
            if (temperatures[i] == -1) {
                // Find the left and right valid neighbors
                int left = i - 1;
                int right = i + 1;
                
                // Find the nearest valid neighbors
                while (left >= 0 && temperatures[left] == -1) {
                    left--;
                }
                while (right < N && temperatures[right] == -1) {
                    right++;
                }
                
                // Replace -1 with the average of valid neighbors
                if (left >= 0 && right < N) {
                    temperatures[i] = (temperatures[left] + temperatures[right]) / 2;
                } else if (left >= 0) {
                    temperatures[i] = temperatures[left];
                } else if (right < N) {
                    temperatures[i] = temperatures[right];
                }
            }
        }
        
        // Output the corrected temperatures
        for (int temp : temperatures) {
            System.out.print(temp + " ");
        }
    }
}
