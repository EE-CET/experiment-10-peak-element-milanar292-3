import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = -1;

        // Case when only one element exists
        if (n == 1) {
            peakIndex = 0;
        }
        else {
            // Check first element
            if (arr[0] >= arr[1]) {
                peakIndex = 0;
            }
            else {
                // Check middle elements
                for (int i = 1; i < n - 1; i++) {
                    if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                        peakIndex = i;
                        break;   // first peak found
                    }
                }

                // Check last element if still not found
                if (peakIndex == -1 && arr[n - 1] >= arr[n - 2]) {
                    peakIndex = n - 1;
                }
            }
        }

        System.out.println(peakIndex);
    }
}
