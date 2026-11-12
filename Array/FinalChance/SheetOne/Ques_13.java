package FinalChance.SheetOne;

public class Ques_13 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int n = arr.length;
        int arrSum = 0;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            actualSum += i;
        }

        int diff = actualSum - arrSum;
        System.out.println(diff);

    }
}
// missing number