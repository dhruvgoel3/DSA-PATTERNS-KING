package ArraysByBabbar;

public class SumOfPosNeg {
    static int[] getPosNegSum(int arr[]) {
        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum = posSum + arr[i];
            } else {
                negSum = negSum + arr[i];
            }
        }
        int ans[] = {posSum, negSum};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, -3, 5, 5, 7, 3, 3, -4, -7};
        int ans[] = getPosNegSum(arr);
        System.out.println("Possitive value will be :- " + ans[0]);
        System.out.println("Negative value will be :- " + ans[1]);


    }
}
