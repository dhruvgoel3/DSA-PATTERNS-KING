package Hashing;
// Find the first element whose frequency is 1.

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingElement {
    public static void main(String[] args) {
        int ansKey = 0;
        int[] arr = {1, 2, 4, 5, 2, 1, 5, 6};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }
        int ans = -1;

        for (int el : arr) {
            if (map.get(el) == 1) {
                ans = el;
                break;
            }
        }

        System.out.println("First Non-Repeating Element: " + ans);


    }
}
