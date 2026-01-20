package PrefixSum;

// Given an array arr and an integer k,You have to count
// how many subarrays starting from index 0 have sum equal to k.
public class CountSubarrays {
    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                count++;

            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1};
        int k = 6;

        System.out.println(subarraySum(arr, k));

    }
}
