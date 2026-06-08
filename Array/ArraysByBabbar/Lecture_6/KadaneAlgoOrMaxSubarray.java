package ArraysByBabbar.Lecture_6;

public class KadaneAlgoOrMaxSubarray {
    public static int maximumSubArraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;

    }

    static void main() {
        int[] arr = {1, 2, 5, 2, 6, -8, 3, 2, 5, 3};
        System.out.println(maximumSubArraySum(arr));

    }

}
//