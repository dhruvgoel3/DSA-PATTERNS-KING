package ArraysByBabbar.BinarySearchByBabbar;

public class BinarySearch {
    public static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return true;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;


    }

    public static void main() {
        int[] arr = {0, 2, 5, 6, 8, 10, 45, 84};
        int target = 45;
        System.out.println(binarySearch(arr, target));
    }
}
