package TwoPointer.Basic;

public class MoveAllZerosTooEnd_6 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 4, 2, 0, 5, 0, 4, 0, 6};
        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        while (k < n) {
            arr[k] = 0;
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
