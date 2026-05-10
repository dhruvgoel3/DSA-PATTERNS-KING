package TwoPointer.Basic;

public class CheckDIff {
    public static boolean checkDiff(int arr[], int k) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            int diff = arr[j] - arr[i];
            if (diff == k) {
                return true;
            } else if (diff < k) {
                j++;
            } else {
                i++;
            }
            if (i == j) {
                j++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 10};
        int k = 2;
        System.out.println(checkDiff(arr , k));

    }
}
