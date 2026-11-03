package ArraysByStriver.Easy;

// This approaches will work if our array has only +ve elements
public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumKBrute(int[] arr, int k) { // Bruteforce
        int length = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }

        return length;
    } // Bruteforce

    public static int longestSubarrayWithSumKOptimal(int[] arr, int k) { // Bruteforce
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        int n = arr.length;
        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > k) {
                sum = sum - arr[left];
                left++;

            }

            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;


    } // Sliding Window
    public static int longestSubarrayWithSumKPrefixSum(int[] arr, int k) { // Bruteforce
        int left = 0;
        int sum = 0;
        int maxLen = 0;
        int n = arr.length;
        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > k) {
                sum = sum - arr[left];
                left++;

            }

            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;


    } // Prefix Sum Approach





    static void main() {

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarrayWithSumKBrute(arr, k));
        System.out.println(longestSubarrayWithSumKOptimal(arr, k));


    }
}
