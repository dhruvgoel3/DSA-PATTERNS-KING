package TwoPointer.Basic;

public class SeparateOddEven_5 {
    public static int[] separateOddEven(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (arr[start] % 2 != 0 && arr[end] % 2 == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            if (arr[start] % 2 == 0) {
                start++;
            } else {
                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {13, 34, 35, 9, 8, 90, 3};
        separateOddEven(arr);
        System.out.println("Here are the separated odd and even elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
