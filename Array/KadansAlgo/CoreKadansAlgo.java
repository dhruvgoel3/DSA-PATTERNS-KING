package KadansAlgo;

public class CoreKadansAlgo {
    public static  int maxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either take current element alone
            // or extend previous subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(arr));

    }
}
