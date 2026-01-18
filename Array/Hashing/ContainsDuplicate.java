package Hashing;

import java.util.HashMap;

// If a element occurs more than two times in a array , then return true otherwise false
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        for (int el : map.values()) {
            if (el >= 2) {
                return true;

            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 2, 1, 5, 2, 1};
        System.out.println(containsDuplicate(arr));


    }


}
