package SlidingWindow;

public class MaximumAvgOfSubarray {
    public static double maxAvgSubarray(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];

            maxSum = Math.max(windowSum, maxSum);

        }
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(maxAvgSubarray(arr, k));

    }
}
