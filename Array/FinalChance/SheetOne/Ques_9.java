package FinalChance.SheetOne;

public class Ques_9 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int el = arr[0];


        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n-1] = el;

        for (int num : arr) {
            System.out.print(num + " , ");

        }

    }
}
// left rotate an aaray by one place
// arr ---> 1,2,3,4,5
// ans -----> 2,3,4,5,1