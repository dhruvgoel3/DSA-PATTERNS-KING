package FinalChance;

public class Ques_5 {
    static void main() {
        int[] arr = {40, 20, 80, 100, 500, 0, 50};
        int n = arr.length;

        int largest = arr[0];
        int secondLargest = arr[0];

        // Finding the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

// finding the second largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] < largest && arr[i] >= secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
// Find the second largest elemnet in teh