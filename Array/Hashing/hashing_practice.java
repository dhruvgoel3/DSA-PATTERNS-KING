package Hashing;

import java.util.HashMap;
import java.util.Map;

public class hashing_practice {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 2, 6, 8, 9, 2, 5, 1, 3, 1, 4, 1, 6, 8, 6, 7, 9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);


        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int ans = -1;

        for (int el : arr) {
            if (map.get(el) == 1) {
                ans = el;
                break;

            }
        }
        System.out.println(ans);
    }
}
