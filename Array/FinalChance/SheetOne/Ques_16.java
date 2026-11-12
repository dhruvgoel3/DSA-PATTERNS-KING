package FinalChance.SheetOne;

public class Ques_16 {

    public static int bruteForce(int[] arr, int k) {
        int maxSum = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static int optimal(int[] arr, int k) {

        int n = arr.length;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        maxSum = sum;

        for (int j = k; j < n; j++) {
            maxSum += arr[j];
            maxSum -= arr[j - k];

            maxSum = Math.max(maxSum, sum);
        }


        return maxSum;

    }

    static void main() {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Bruteforce :- "+bruteForce(arr,k));
        System.out.println("Optimal :- "+ optimal(arr,k));

    }
}
// Find the maximum sum among all the subarrays of size k
// this is called variable window