package ArraysByBabbar.Lecture_2;

public class PrintExtremeElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            System.out.print(arr[i] + " ");
            i++;
            System.out.print(arr[j] + " ");
            j--;

        }
        if (i == j) {
            System.out.print(arr[i] + " ");
        }
    }
}
