package PrefixSum;

// Finding and learning what is prefix sum
public class ArrayPrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};


        int n = arr.length;
        if (arr.length == 0) return;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }

    }
}
