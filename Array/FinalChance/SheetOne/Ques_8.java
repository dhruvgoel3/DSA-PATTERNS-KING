package FinalChance.SheetOne;

public class Ques_8 {
    static void main() {
        int[] arr = {1, 2, 5, 2, 0, 4, 8, 0, 2, 7, 0, 5, 0};
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        for (int el : arr) {
            System.out.print(el + " , ");
        }
    }
}


// move zeros