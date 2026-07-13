public class MaxSubarrayOfSizeK {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpuLoad.length; end++) {

            // Add current element to the window
            windowSum += cpuLoad[end];

            // When window size becomes k
            if (end >= k - 1) {

                // Update maximum sum
                maxSum = Math.max(maxSum, windowSum);

                // Remove first element of the window
                windowSum -= cpuLoad[start];

                // Slide the window
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpuLoad = {10, 20, 30, 40, 50, 60, 70};
        int k = 5;

        int result = maxSubarrayOfSizeK(cpuLoad, k);

        System.out.println("Maximum CPU Load in " + k + "-second window: " + result);
    }
}