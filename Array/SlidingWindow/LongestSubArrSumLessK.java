package SlidingWindow;

// Longest Subarray With Sum ≤ K
public class LongestSubArrSumLessK {
    public static int longestSubArrSumLessThenK(int[] arr, int k) {
        int n = arr.length;
        int maxLength = Integer.MIN_VALUE;
        int windowSum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            windowSum += arr[right];


            while (windowSum <= k) {
                maxLength = Math.max(maxLength, right - left + 1);
                windowSum -= arr[left];
                left++;
            }
        }
        return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength;


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;
        System.out.println(longestSubArrSumLessThenK(arr,k));
    }
}
