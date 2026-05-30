package ArraysByBabbar.Lecture_1;

public class MaximumElementInArray {
    public static int maximumElement(int[] arr) {
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }

        }
        return maxElement;
    }

    public static int secondLargestElement(int[] arr) {
        int largest = maximumElement(arr);
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 2, 6, 9, 5, 3};
        System.out.println("Maximum element in the array is : - " + maximumElement(arr));
        System.out.println("Second Largest is :- "+secondLargestElement(arr));

    }
}
