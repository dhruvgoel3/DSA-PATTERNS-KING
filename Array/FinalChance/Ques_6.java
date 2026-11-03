package FinalChance;

public class Ques_6 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        for (int el : arr) {
            System.out.print(el + " ");
        }

    }
}
// reverse an array