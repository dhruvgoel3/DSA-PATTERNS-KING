package FinalChance.SheetOne;

public class Ques_3 {
    static void main() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int even = 0;
        int odd = 0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                odd++;

            } else {
                even++;
            }
        }

        System.out.println("Total number of even numbers are :- " + even + " and total number of odd numbers are :- " + odd);

    }
}
// counting even odd number