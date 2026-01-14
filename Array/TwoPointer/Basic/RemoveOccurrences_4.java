package TwoPointer.Basic;

// Remove occurrences of element x from array
public class RemoveOccurrences_4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 3, 3, 2, 7, 6, 4};
        int x = 4;
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != x) {
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
