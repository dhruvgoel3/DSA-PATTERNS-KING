package ArraysByBabbar.Lecture_4;

public class PivotIndex {

    public static int pivotIndex(int[] arr) {

        int n = arr.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        // Prefix Sum
        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i];
        }

        // Suffix Sum
        rightSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i];
        }

        // Check Pivot Index
        for (int i = 0; i < n; i++) {

            int left = (i == 0) ? 0 : leftSum[i - 1];
            int right = (i == n - 1) ? 0 : rightSum[i + 1];

            if (left == right) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(arr));
    }
}