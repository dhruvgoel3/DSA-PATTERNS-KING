package FinalChance;

public class Ques_10 {
    public static void reverse(int[] arr, int i, int j) {
        int n = arr.length;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5, 8, 2, 5, 8, 0};
        int n = arr.length;
        int k = 7;
        int i = 0;
        int j = n - 1;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);


        for (int el : arr) {
            System.out.print(el + " ");

        }


    }
}
// left rotate an aaray by one place
// arr ---> 1,2,3,4,5
// ans -----> 2,3,4,5,1