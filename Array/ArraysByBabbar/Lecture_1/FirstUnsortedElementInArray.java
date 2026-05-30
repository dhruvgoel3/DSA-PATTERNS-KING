package ArraysByBabbar.Lecture_1;


public class FirstUnsortedElementInArray {
    public static int firstUnsorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return arr[i + 1];
            }
        }

        return -1; // array is sorted
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 3, 10};
        System.out.println(firstUnsorted(arr));


    }
}
