package SlidingWindow.FamousQuestions;
// Maximum points you can obtain from cards
// You can pick the elements only from starting or last


public class Question_1 {
    public static int maxPoints(int[] arr, int k) {
        int n = arr.length;
        int end = n - 1;
        int leftSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            leftSum = leftSum + arr[i];

        }
        maxSum = leftSum;
        for (int i = k - 1; i >= 0; i--) {
            leftSum = leftSum - arr[i];
            leftSum = leftSum + arr[end];
            end--;

            maxSum = Math.max(maxSum, leftSum);
        }
        return maxSum;
    }

    static void main() {
        int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        System.out.println(maxPoints(arr, k));
    }
}
