package SlidingWindow;

public class MinSubArrLengthSum {
    public static int minSubArrayLen(int k, int[] arr) {
        int n = arr.length;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < n; right++) {
            windowSum += arr[right];

            while (windowSum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= arr[left];
                left++;
            }

        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }


    public static void main(String[] args) {
        int k = 7;
        int[] arr = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(k, arr));

    }

}
