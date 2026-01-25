package SlidingWindow;

public class MaxSubArrSumEqualToK {
    public static int maxSubArrSum(int[] arr, int k) {

        int n = arr.length;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];

            maxSum = Math.max(windowSum, maxSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSubArrSum(arr,k));

    }
}
