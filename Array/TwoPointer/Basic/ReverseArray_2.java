package TwoPointer.Basic;

// Reverse a given array
public class ReverseArray_2 {
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 7, 3, 5, 3};
        reverseArray(arr); // Method call
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
