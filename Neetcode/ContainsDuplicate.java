package Neetcode;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean duplicates(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int el : map.values()) {
            if (el >= 2) {
                return true;
            }
        }
        return false;

    }

    static void main() {
        int[] arr = {1, 5, 3, 8, 2, 7, 9, 3, 7};
        System.out.println(duplicates(arr));


    }
}
