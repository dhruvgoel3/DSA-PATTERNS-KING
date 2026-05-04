package ArraysByStriver.Easy;


public class SecondLargest {
    public static int secondLargestElement(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 2, 6, 3, 7, 9};

        System.out.println(secondLargestElement(arr));
    }
}
