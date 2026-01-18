package Hashing;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int second = target - arr[i];

            if (map.containsKey(second)) {
                return new int[]{map.get(second), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{}; // no solution
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7};
        int target = 8;

        int[] result = twoSum(arr, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
        } else {
            System.out.println("No pair found");
        }
    }
}
