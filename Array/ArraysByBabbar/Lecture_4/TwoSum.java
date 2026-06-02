package ArraysByBabbar.Lecture_4;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; i < n; i++) {
                if (arr[i] + arr[j] == target) {
                    int[] ans = {arr[i], arr[j]};

                }
            }

        }
        int[] go = {};
        return go;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 6, 3, 2, 6, 8, 3, 5};
        int target = 6;
        int[] ans = twoSum(arr, target);
        for (int i = 0; i<ans.length; i++)
        {
            System.out.println(ans[i]);
        }
    }
}
//