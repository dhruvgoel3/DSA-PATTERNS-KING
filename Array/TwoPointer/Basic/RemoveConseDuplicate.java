package TwoPointer.Basic;

public class RemoveConseDuplicate {
    public static int removeDuplicates(int arr[]) {
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[k]) {
                k++;
                arr[k] = arr[i];

            }

        }
        return k + 1;


    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 3, 4, 4};
        System.out.println(removeDuplicates(arr));

    }
}
