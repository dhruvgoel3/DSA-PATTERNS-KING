package PrefixSum;

public class MaximumPrefixSum {
    public static int maxPrefixSum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;  // Important fix

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, 3, -3, -5, 8};
        System.out.println(maxPrefixSum(arr));

    }
}
