package PrefixSum;

import java.util.ArrayList;

// Finding and learning what is prefix sum
public class ArrayPrefixSum {
    public static ArrayList<Integer> prefixSum(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr.length == 0) return ans;
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int currentSum = ans.get(i - 1) + arr[i];
            ans.add(currentSum);
        }
        return ans;


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(prefixSum(arr));


    }
}
