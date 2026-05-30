package ArraysByBabbar.Lecture_1;

public class CountZerosOnes {
    public static int[] countZerosOnes(int[] arr) {
        int zeros = 0;
        int ones = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            } else if (arr[i] == 1) {
                ones++;

            }
        }
        int[] ZerosOnes = {zeros, ones};
        return ZerosOnes;

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 0, 3, 7, 0, 1, 5, 0, 1, 0, 1, 1, 0, 0};
        int ans[] = countZerosOnes(arr);
        for (int i = 0; i < ans.length - 1; i++) {
            System.out.println("No of zeros are :-  " + ans[0]);
            System.out.println("No of zeros are :-  " + ans[1]);
        }

    }
}
