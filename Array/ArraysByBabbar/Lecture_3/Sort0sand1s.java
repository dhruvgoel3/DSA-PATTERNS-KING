package ArraysByBabbar.Lecture_3;

public class Sort0sand1s {
    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1};
        int[] ans = sortArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
