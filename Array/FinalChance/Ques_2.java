package FinalChance;

public class Ques_2 {
    public static int findMaxElement(int[] arr) {
        int n = arr.length;

        int maxEle = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }
        return maxEle;

    }

    static void main() {
        int[] arr = {1, 8, 2, 7, 4, 7, 3, 0, 1, -2, -10};
        System.out.println(findMaxElement(arr));

    }
}
