package ArraysByStriver.Easy;

public class LargestElement {
    public static int largestElement(int[] arr) {
        int n = arr.length;
        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 2, 6, 3, 7, 9};

        System.out.println(largestElement(arr));
    }
}
