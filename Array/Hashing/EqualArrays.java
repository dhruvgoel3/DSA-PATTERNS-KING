package Hashing;

import java.util.HashMap;

public class EqualArrays {
    public static boolean areEqual(int[] arr1, int[] arr2) {

        // Step 1: If lengths are different, arrays can't be equal
        if (arr1.length != arr2.length) {
            return false;
        }

        // Step 2: Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 3: Count frequency of arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 4: Reduce frequency using arr2
        for (int num : arr2) {

            if (!map.containsKey(num)) {
                return false;   // element not present
            }

            map.put(num, map.get(num) - 1);

            if (map.get(num) < 0) {
                return false;   // extra element
            }
        }

        // Step 5: All matched
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(areEqual(arr1, arr2));


    }
}
