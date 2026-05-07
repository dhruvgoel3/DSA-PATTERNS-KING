package ArraysByBabbar;

public class AvgOfElements {
    public static double findAvg(int arr[]) {
        int sum = 0;
        double avg = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        avg = sum / n;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9, 6, 4, 5};
        System.out.println(findAvg(arr));
    }
}
