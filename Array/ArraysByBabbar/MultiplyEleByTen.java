package ArraysByBabbar;

public class MultiplyEleByTen {
    public static int[] findAvg(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            ans[j] = arr[i] * 10;
            j++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9, 6, 4, 5};
        int[] result = findAvg(arr);  // function call

        // print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }
}
