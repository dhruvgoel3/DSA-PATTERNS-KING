package FinalChance.SheetOne;

public class Ques_17 {

    static void main() {
        int[] arr = {1, 3, 5, 2, 2};
        int n = arr.length;
        int right = n - 1;


        int leftSum = 0;
        int rightSum = 0;


        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            rightSum += arr[right];

            if (rightSum == leftSum) {
                System.out.println("Equilibbrium point is " + i);
                return;
            } else {
                right--;
            }
        }
    }


}
// Equilibrium index (leftsum === rightsum , find that index)