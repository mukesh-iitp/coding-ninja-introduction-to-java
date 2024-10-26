package lecture10;

public class CountSmall {
	
	public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
       int minDiff = Integer.MAX_VALUE; // Initialize with maximum integer value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int diff = Math.abs(arr1[i] - arr2[j]); // Calculate absolute difference
                if (diff < minDiff) {
                    minDiff = diff; // Update smallest difference found so far
                }
            }
        }
        return minDiff;
    }

	public static void main(String[] args) {

		int a[]= {2, 3, 0};
		int b[]= {5, 1};
				

	}

}
