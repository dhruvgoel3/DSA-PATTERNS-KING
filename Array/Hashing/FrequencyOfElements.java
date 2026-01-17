package Hashing;

import java.util.HashMap;
import java.util.Map;
// Given an array, count frequency of each element.
public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2, 1, 5, 3, 6, 3, 6};
        Map<Integer, Integer> map = new HashMap<>();

        for (int el : arr) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }

        System.out.println("Element : Frequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
